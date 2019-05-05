package mvp.com.zhou.mvp.ui.adapter.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.bean.BreedBatch;


/**
 * Created by fei on 2018/4/3.
 */
public class SelectBreedBatchAdapter extends BaseAdapter {
    private Context mContext;
    private List<BreedBatch> mList;


    public SelectBreedBatchAdapter(Context context, List<BreedBatch> list) {
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
            convertView = View.inflate(mContext, R.layout.list_item_select_breed_batch, null);
            holder = new ViewHolder();
            holder.tvNumber = convertView.findViewById(R.id.tv_select_breedbatch);
            holder.tvStartDate = convertView.findViewById(R.id.tv_select_start_date);
            holder.tvEndDate = convertView.findViewById(R.id.tv_select_end_date);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvNumber.setText(mList.get(position).getNumber());
        holder.tvStartDate.setText(mList.get(position).getBreedingStartDate());
        holder.tvEndDate.setText(mList.get(position).getBreedingEndDate());
        return convertView;
    }

    class ViewHolder {
        TextView tvNumber;
        TextView tvStartDate;
        TextView tvEndDate;
    }


}
