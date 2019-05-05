package mvp.com.zhou.mvp.ui.adapter.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.bean.PigFile;


/**
 * Created by fei on 2018/4/3.
 */
public class SelectPigAdapter extends BaseAdapter {
    private Context mContext;
    private List<PigFile> mList;
    private boolean showSelect;


    public SelectPigAdapter(Context context, List<PigFile> list, boolean showSelect) {
        mContext = context;
        mList = list;
        this.showSelect = showSelect;
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
            convertView = View.inflate(mContext, R.layout.list_item_select_pig, null);
            holder = new ViewHolder();
            holder.tvNumber = convertView.findViewById(R.id.tv_select_more_number);
            holder.tvType = convertView.findViewById(R.id.tv_select_more_type);
            holder.checkBox = convertView.findViewById(R.id.cb_select_more_check);
            holder.tvLocation = convertView.findViewById(R.id.tv_select_more_location);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvNumber.setText(mList.get(position).getNumber());
        holder.tvType.setText(mList.get(position).getPigState_name());
        if (showSelect) {
            holder.checkBox.setVisibility(View.VISIBLE);
            holder.checkBox.setImageResource(mList.get(position).isSelect()
                    ? R.drawable.check_checked : R.drawable.check_normal);

        } else {
            holder.checkBox.setVisibility(View.GONE);
        }
        holder.tvLocation.setText(mList.get(position).getBuildArchives_name());
        return convertView;
    }

    class ViewHolder {
        TextView tvNumber;
        TextView tvType;
        TextView tvLocation;
        ImageView checkBox;
    }


}
