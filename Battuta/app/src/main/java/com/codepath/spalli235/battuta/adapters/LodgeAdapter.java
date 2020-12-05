package com.codepath.spalli235.battuta.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.codepath.spalli235.battuta.R;

import javax.annotation.Nonnegative;

public class LodgeAdapter {
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView lodgeName;
        TextView roomInfo;
        TextView lodgePrice;
        ImageView ivLodge;
        public ViewHolder(@Nonnegative View itemView)
        {
            super(itemView);
                lodgePrice = itemView.findViewById(R.id.lodgePrice);
                lodgeName = itemView.findViewById(R.id.lodgeName);
                roomInfo = itemView.findViewById(R.id.roomInfo);
                ivLodge = itemView.findViewById(R.id.ivLodge);
        }
    }
}
