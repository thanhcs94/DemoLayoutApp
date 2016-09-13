package com.thanhcs.lifeofdev.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thanhcs.lifeofdev.R;

import java.util.List;

/**
 * Created by thanhcs94 on 7/25/2016.
 */
public class InforViewAdapter extends RecyclerView.Adapter<InforViewAdapter.BookViewHolder> {
    public List<String> arrData;
    public Activity mContext ;
    public InforViewAdapter(List<String> arrData, Activity mmContext){
        this.arrData = arrData;
        this.mContext = mmContext ;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycle_infor, viewGroup, false);
        BookViewHolder pvh = new BookViewHolder(v, mContext, arrData);
        return pvh;
    }

    @Override
    public void onBindViewHolder(BookViewHolder bookViewHolder, int i) {
        bookViewHolder.tvTitle.setText("Nguồn gốc thực phẩm" + i);
        bookViewHolder.tvDes.setText(arrData.get(i));
    }
    @Override
    public int getItemCount() {
        return arrData.size();
    }


    public static class BookViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public Activity mContext;
        public List<String> arrData;
        TextView tvTitle, tvDes;
        public BookViewHolder(View itemView , Activity mContext, List<String> arrData) {
            super(itemView);
            this.mContext = mContext;
            this.arrData = arrData;
            tvTitle = (TextView)itemView.findViewById(R.id.tvTitle);
            tvDes = (TextView)itemView.findViewById(R.id.tvDes);
        }

        @Override
        public void onClick(View view) {

        }
    }
}