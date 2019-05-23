package com.zhou.ghost.ui.view.tool;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.zhou.ghost.R;
import com.zhou.ghost.ui.presenter.tool.CreateQRPresenterImpl;
import com.zhou.ghost.ui.view.base.BaseActivity;
import com.zhou.ghost.utils.lanyu.ZXingUtils;

public class CreateQRViewActivity extends BaseActivity<CreateQRPresenterImpl> {

    private Button createBtn;
    private EditText createEt;
    private ImageView createIv;

    @Override
    public CreateQRPresenterImpl initPresent() {
        return new CreateQRPresenterImpl();
    }

    @Override
    public void initView() {
        setContentView(R.layout.act_tool_qr_code_create);
        createBtn = findViewById(R.id.act_tool_qr_create_btn);
        createEt = findViewById(R.id.act_main_tool_qr_et);
        createIv = findViewById(R.id.act_main_tool_qr_iv);
    }

    @Override
    public String setTitleText() {
        return "二维码生成";
    }

    @Override
    public void initEvent() {
        createBtn.setOnClickListener(this);

    }

    @Override
    public void initData() {

    }


//    public void createQRCodeImage(String url)
//    {
//
//        int w=500;
//        int h=500;
//        try
//        {
//            //判断URL合法性
//            if (url == null || "".equals(url) || url.length() < 1)
//            {
//                return;
//            }
//            Hashtable<EncodeHintType, String> hints = new Hashtable<>();
//            hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
//            //图像数据转换，使用了矩阵转换
//            BitMatrix bitMatrix = new QRCodeWriter().encode(url, BarcodeFormat.QR_CODE, w, h, hints);
//            int[] pixels = new int[w * h];
//            //下面这里按照二维码的算法，逐个生成二维码的图片，
//            //两个for循环是图片横列扫描的结果
//            for (int y = 0; y < h; y++)
//            {
//                for (int x = 0; x < w; x++)
//                {
//                    if (bitMatrix.get(x, y))
//                    {
//                        pixels[y * w + x] = 0xff000000;
//                    }
//                    else
//                    {
//                        pixels[y * w + x] = 0xffffffff;
//                    }
//                }
//            }
//            //生成二维码图片的格式，使用ARGB_8888
//            Bitmap bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
//            bitmap.setPixels(pixels, 0, w, 0, 0, w, h);
//            //显示到我们的ImageView上面
//            createIv.setImageBitmap(bitmap);
//        }
//        catch (WriterException e)
//        {
//            e.printStackTrace();
//        }
//    }

    @Override
    public void onMyClick(View v) {
        switch (v.getId()) {
            case R.id.act_tool_qr_create_btn:
                String create = createEt.getText().toString().trim();
                if (TextUtils.isEmpty(create)) {
                    showToast("不能为空");
                    break;
                }
                Bitmap qrImage = ZXingUtils.createQRImage("" + create, 500, 500);
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
                Bitmap bitmap1 = ZXingUtils.addLogo(qrImage, bitmap);
                createIv.setImageBitmap(bitmap1);
//                createQRCodeImage(""+create);

//                /* w：图片的宽
//                 * h：图片的高
//                 * logo：不需要logo的话直接传null
//                 * */
//
//                Bitmap logo = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_3d_blue);
//                Bitmap bitmap = null;
//                bitmap = CodeCreator.createQRCode(create, 400, 400, logo);
//                if (bitmap != null) {
//                    createIv.setImageBitmap(bitmap);
//                }


                break;
        }
    }
}
