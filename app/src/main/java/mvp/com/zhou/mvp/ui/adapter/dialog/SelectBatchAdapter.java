package mvp.com.zhou.mvp.ui.adapter.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.bean.BatchFile;

/**
 * Created by fei on 2018/4/3.
 */
public class SelectBatchAdapter extends BaseAdapter {
    private Context mContext;
    private List<BatchFile> mList;


    public SelectBatchAdapter(Context context, List<BatchFile> list) {
        mContext = context;
        mList = list;
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
            return mList.get(position);
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.list_item_select_batch_file, null);
            holder = new ViewHolder();
            holder.tvNumber = convertView.findViewById(R.id.tv_select_batch_num);
            holder.tvCount = convertView.findViewById(R.id.tv_select_batch_count);
            holder.tvDay = convertView.findViewById(R.id.tv_select_batch_day);
            holder.tvPigState = convertView.findViewById(R.id.tv_select_batch_pig_state);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvNumber.setText(mList.get(position).getNumber());
        holder.tvCount.setText(mList.get(position).getGenct());
        holder.tvDay.setText(mList.get(position).getDays());
        holder.tvPigState.setText(mList.get(position).getPk_vtype_name());
        return convertView;
    }

    class ViewHolder {
        TextView tvNumber;
        TextView tvCount;
        TextView tvDay;
        TextView tvPigState;
    }


}
