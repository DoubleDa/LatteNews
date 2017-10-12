package com.dyx.ln;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Author：dayongxin
 * Function：
 */
public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder> {
    private Context mContext;
    private List<String> mDatas;
    private LayoutInflater mLayoutInflater;

    public RvAdapter(Context mContext, List<String> mDatas) {
        this.mContext = mContext;
        this.mDatas = mDatas;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item_new_layout, parent, false);
        return new RvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RvViewHolder holder, int position) {
        holder.tvContent.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public static class RvViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_content)
        TextView tvContent;

        public RvViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
