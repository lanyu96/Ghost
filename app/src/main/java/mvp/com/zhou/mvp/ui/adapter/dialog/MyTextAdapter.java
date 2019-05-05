package mvp.com.zhou.mvp.ui.adapter.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import mvp.com.zhou.mvp.R;


/**
 * Created by fei on 2018/3/2.
 */
public class MyTextAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> mList;

    public MyTextAdapter(Context mContext, List<String> mList) {
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
            convertView = View.inflate(mContext, R.layout.list_item_text, null);
            holder = new ViewHolder();
            holder.text = (TextView) convertView.findViewById(R.id.tv_pigtype);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.text.setText(mList.get(position));
        return convertView;
    }

     class ViewHolder {
        TextView text;
    }
}
