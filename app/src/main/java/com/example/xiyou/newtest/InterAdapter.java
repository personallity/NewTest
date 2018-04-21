package com.example.xiyou.newtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by XiYou on 2018/4/20.
 */

public class InterAdapter extends RecyclerView.Adapter<InterAdapter.ViewHolder>{

    private List<Inter> mInterList;
    private Context context;;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View interView;
        ImageView interImage;
        TextView interName;

        public ViewHolder(View view){
            super(view);
            interView=view;
            interImage=(ImageView) view.findViewById(R.id.inter_image);
            interName=(TextView) view.findViewById(R.id.inter_name);
        }
    }


public InterAdapter(Context mcontext,List<Inter> interList){
    this.context=mcontext;
    mInterList=interList;
}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.inter_item,parent,false);
    final ViewHolder holder=new ViewHolder(view);
    holder.interView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int position=holder.getAdapterPosition();
            Inter inter=mInterList.get(position);
            Click(inter.getUrl());
        }
    });

    holder.interImage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int position=holder.getAdapterPosition();
            Inter inter=mInterList.get(position);
            Click(inter.getUrl());
        }
    });
    return holder;
    }

    private void Click(String url){

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        context.startActivity(intent);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position) {
    Inter inter=mInterList.get(position);
    holder.interImage.setImageResource(inter.getImageId());
    holder.interName.setText(inter.getName());
    }

    @Override
    public int getItemCount(){
    return mInterList.size();
    }

}
