package mvp.com.zhou.mvp.ui.adapter.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.bean.BatchFile;


/**
 * Created by fei on 2018/3/2.
 */
public class SelectMoreBatchAdapter extends BaseAdapter {
    private Context mContext;
    private List<BatchFile> mList;

    private boolean selectMore = false;

    public void setSelectMore(boolean selectMore) {
        this.selectMore = selectMore;
    }

    public SelectMoreBatchAdapter(Context mContext, List<BatchFile> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        if (mList != null) {
            return mList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (mList != null) {
            return  mList.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        if (mList != null) {
            return position;
        }
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.list_item_select_more_batch, null);
            holder = new ViewHolder();
            holder.number = (TextView) convertView.findViewById(R.id.tv_batch_number);
            holder.location = (TextView) convertView.findViewById(R.id.tv_batch_location);
            holder.image = (ImageView) convertView.findViewById(R.id.cb_batch_select);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.location.setText(mList.get(position).getRegnm_name());
        holder.number.setText(mList.get(position).getNumber());
        if(selectMore) {
            holder.image.setVisibility(View.VISIBLE);
            if(!mList.get(position).isSelect()){
                holder.image.setImageResource(R.drawable.check_normal);
            }else{
                holder.image.setImageResource(R.drawable.check_checked);
            }

        }else{
            holder.image.setVisibility(View.GONE);
        }
        return convertView;
    }

     class ViewHolder {
         TextView location;
        TextView number;
        ImageView image;
    }
}
