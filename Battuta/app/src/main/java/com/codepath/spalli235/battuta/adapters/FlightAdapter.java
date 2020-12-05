package com.codepath.spalli235.battuta.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codepath.spalli235.battuta.R;
import com.codepath.spalli235.battuta.models.FlightList;

import java.util.List;

import javax.annotation.Nonnegative;

public class FlightAdapter extends RecyclerView.Adapter<FlightAdapter.ViewHolder>{

    Context context;
    List<FlightList> flights;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

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
