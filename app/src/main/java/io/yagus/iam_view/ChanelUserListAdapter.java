package io.yagus.iam_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

public class ChanelUserListAdapter extends RecyclerView.Adapter<ChanelUserListAdapter.ViewHoder> {

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_list,parent,false);

        return new ViewHoder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {

        RequestOptions options = RequestOptions.bitmapTransform(new RoundedCorners(20)).error(R.drawable.user_icon);

        Glide.with(holder.itemView.getContext())
                .load(R.drawable.user_icon)
                .centerCrop()
                .apply(options)
                .into(holder.iv_user);

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ViewHoder extends RecyclerView.ViewHolder {

        public final ImageView iv_user;

        public ViewHoder(@NonNull View itemView) {
            super(itemView);

            iv_user = itemView.findViewById(R.id.iv_user);
        }
    }
}
