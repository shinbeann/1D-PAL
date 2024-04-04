package com.example.a1dpal;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.recyclerview.widget.RecyclerView;

public class Stage extends RecyclerView.Adapter<MyViewHolder> {
    public class MyAdapter {


        Context context;
        List<Item> items;

        public MyAdapter(Context context, List<Item> items) {
            this.context = context;
            this.items = items;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
            return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull  MyViewHolder holder, int position) {
            holder.nameView.setText(items.get(position).getName());
            holder.imageView.setImageResource(items.get(position).getImage());
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }
