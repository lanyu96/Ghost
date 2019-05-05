package mvp.com.zhou.mvp.ui.adapter.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.bean.MaterielByHouse;


/**
 * Created by fei on 2018/3/2.
 */
public class SelectMaterialAdapter extends BaseAdapter {
    private Context mContext;
    private List<MaterielByHouse> mList;

    public SelectMaterialAdapter(Context mContext, List<MaterielByHouse> mList) {
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.list_item_select_material, null);
            holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.tv_material_name);
            holder.tvNumber = (TextView) convertView.findViewById(R.id.tv_material_number);
            holder.tvBatch = (TextView) convertView.findViewById(R.id.tv_material_batch);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvName.setText(mList.get(position).getMaterial_name());
        holder.tvNumber.setText(mList.get(position).getMaterial_number());
        holder.tvBatch.setText(mList.get(position).getLot());
        return convertView;
    }

    class ViewHolder {
        TextView tvName;
        TextView tvNumber;
        TextView tvBatch;
    }
}
