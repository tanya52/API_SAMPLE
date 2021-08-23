package com.example.api_sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class modelAdapter extends RecyclerView.Adapter<modelAdapter.modelViewholder> {

    List<model> modelList;
    Context context;

    public modelAdapter(Context context,List<model> posts){
        this.context=context;
        modelList=posts;
    }

    @NonNull
    @Override
    public modelViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new modelViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull modelViewholder holder, int position) {
        model Model=modelList.get(position);
        holder.id.setText(Model.getId());
        holder.user_id.setText(Model.getUser_id());
        holder.title.setText(Model.getTitle());
        holder.body.setText(Model.getBody());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public static class modelViewholder extends RecyclerView.ViewHolder{
        TextView id, user_id, title, body;
        public modelViewholder(@NonNull View itemView) {
            super(itemView);

            id=itemView.findViewById(R.id.id);
            user_id=itemView.findViewById(R.id.user_id);
            title=itemView.findViewById(R.id.title);
            body=itemView.findViewById(R.id.body);
        }
    }
}
