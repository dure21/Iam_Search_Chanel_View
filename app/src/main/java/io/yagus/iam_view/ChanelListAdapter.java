package io.yagus.iam_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ChanelListAdapter extends RecyclerView.Adapter<ChanelListAdapter.ViewHoder>{
    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chanel_list,parent,false);

        return new ViewHoder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {

        Glide.with(holder.itemView.getContext())
                .load(R.drawable.food)
                .centerCrop()
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ViewHoder extends RecyclerView.ViewHolder {

        public final ImageView imageView;

        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
