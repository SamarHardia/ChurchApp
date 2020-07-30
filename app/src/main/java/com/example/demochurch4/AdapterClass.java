package com.example.demochurch4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHoler> {

    Context context;
    String[] title,subtitle;
    int[] images;

    public AdapterClass(Context context, String[] title, String[] subtitle, int[] images) {
        this.context = context;
        this.title = title;
        this.subtitle = subtitle;
        this.images = images;
    }


    @NonNull
    @Override
    public AdapterClass.MyViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
   View view = layoutInflater.inflate(R.layout.design_file,parent,false);


        return new MyViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.MyViewHoler holder, int position) {

        holder.imageView.setImageResource(images[position]);
        holder.titletext.setText(title[position]);
        holder.subtitletext.setText(subtitle[position]);


    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MyViewHoler extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView titletext,subtitletext;


        public MyViewHoler(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageViewId);
            titletext=itemView.findViewById(R.id.titletextViewId);
            subtitletext=itemView.findViewById(R.id.descriptionId);

        }
    }
}
