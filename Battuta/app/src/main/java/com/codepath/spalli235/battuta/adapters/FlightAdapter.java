package com.codepath.spalli235.battuta.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.codepath.spalli235.battuta.R;

import javax.annotation.Nonnegative;

public class FlightAdapter {



    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView transportationMethod;
        TextView transportationName;
        TextView transportationPrice;
        ImageView ivTransport;

        public ViewHolder(@Nonnegative View itemView)
        {
            super(itemView);
            transportationMethod = itemView.findViewById(R.id.transportationMethod);
            transportationName = itemView.findViewById(R.id.transportationName);
            transportationPrice = itemView.findViewById(R.id.transportPrice);
            ivTransport = itemView.findViewById(R.id.ivTransport);
        }
    }
}
