package com.zhou.ghost.utils.lanyu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;

import com.zhou.ghost.utils.util.ToastUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ImgUtils {


    public static void saveImageToGallery(Context context, Bitmap bmp) {

        final String[] items = new String[] { "保存图片"};
        //图片转成Bitmap数组
        final Bitmap[] bitmap = new Bitmap[1];
        bitmap[0] = bmp;

//        Glide.with(context).load(url).asBitmap().into(new SimpleTarget<Bitmap>() {
//            @Override
//            public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
//                bitmap[0] = resource;
//            }
//        });

        // 首先保存图片 创建文件夹
        File appDir = new File(Environment.getExternalStorageDirectory(), "shy");
        if (!appDir.exists()) {
            appDir.mkdir();
        }
        //图片文件名称
        String fileName = "shy_"+System.currentTimeMillis() + ".jpg";
        File file = new File(appDir, fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 其次把文件插入到系统图库
        String path = file.getAbsolutePath();
        try {
            MediaStore.Images.Media.insertImage(context.getContentResolver(), path, fileName, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 最后通知图库更新
        Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        Uri uri = Uri.fromFile(file);
        intent.setData(uri);
        context.sendBroadcast(intent);
        new ToastUtils(context).showToast("保存成功");
    }


}
