package com.example.recyclerview;

import android.content.Context;
import android.media.Image;
import android.telecom.StatusHints;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class RecyclerConatctAdapter extends RecyclerView.Adapter<RecyclerConatctAdapter.ViewHolder> {

    Context context;
    ArrayList<Contactmodel> arrContacts;
    RecyclerConatctAdapter(Context context, ArrayList<Contactmodel> arrContacts ){
        this.context = context;
        this.arrContacts = arrContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgContact.setImageResource(arrContacts.get(position).img);
        holder.txtName.setText(arrContacts.get(position).name);
        holder.txtNumber.setText(arrContacts.get(position).number);
        holder.imageView.setImageResource(arrContacts.get(position).img1);

        holder.imgContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = arrContacts.get(position).name;
                Toast.makeText(context,""+position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();



    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName,txtNumber;
        ImageView imgContact,imageView;
        public ViewHolder (View itemsView) {
            super(itemsView);

            txtName=itemsView.findViewById(R.id.txtName);
            txtNumber=itemsView.findViewById(R.id.txtNumber);
            imgContact=itemsView.findViewById(R.id.imgContact);
            imageView = itemsView.findViewById(R.id.imgContact2);
        }

    }

}