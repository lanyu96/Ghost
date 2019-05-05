package mvp.com.zhou.mvp.ui.adapter.dialog;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import mvp.com.zhou.mvp.MyApp;
import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.bean.PenGroupInfo;
import mvp.com.zhou.mvp.ui.callback.OnItemClickListener;


/**
 * Created by fei on 2018/4/3.
 */
public class SelectLocationGroupAdapter extends RecyclerView.Adapter<SelectLocationGroupAdapter.ViewHolder>  {
    private List<PenGroupInfo> mList;
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;

    public SelectLocationGroupAdapter(Context context, List<PenGroupInfo> list) {
        mList = list;
        mContext = context;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    @Override
    public SelectLocationGroupAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final SelectLocationGroupAdapter.ViewHolder viewHolder = new SelectLocationGroupAdapter.ViewHolder(
                LayoutInflater.from(mContext).inflate(R.layout.list_item_location_group, parent, false)
        );
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(viewHolder.position);
                }
            }
        });

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(final SelectLocationGroupAdapter.ViewHolder holder, final int position) {
        holder.tvName.setText(mList.get(position).getAlias());
        if(mList.get(position).isSelect()) {
            holder.llBase.setBackgroundResource(MyApp.getAttrValue(mContext, R.attr.file_selected_button));
            holder.tvName.setTextColor(MyApp.getRes().getColor(R.color.white));
        }else{
            holder.llBase.setBackgroundResource(MyApp.getAttrValue(mContext, R.attr.file_normal_button));
            holder.tvName.setTextColor(MyApp.getRes().getColor(MyApp.getAttrValue(mContext, R.attr.base_color)));
        }

        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    //自定义的ViewHolder,减少findViewById调用次数
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        LinearLayout llBase;
        int position = -1;

        //在布局中找到所含有的UI组件
        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_group_name);
            llBase = (LinearLayout) itemView.findViewById(R.id.ll_group);

        }
    }

}
