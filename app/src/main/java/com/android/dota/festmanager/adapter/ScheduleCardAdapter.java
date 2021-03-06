package com.android.dota.festmanager.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.dota.festmanager.R;
import com.android.dota.festmanager.activity.DetailsActivity;
import com.android.dota.festmanager.activity.MainActivity;
import com.android.dota.festmanager.activity.ScheduleActivity;
import com.android.dota.festmanager.fragment.ScheduleCardsFragment;
import com.android.dota.festmanager.fragment.SchedulePagerFragment;

import java.util.ArrayList;

public class ScheduleCardAdapter extends RecyclerView.Adapter<ScheduleCardAdapter.ScheduleViewHolder> {

    private ArrayList<String> list = new ArrayList<>();
    private Context context;


    public ScheduleCardAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @NonNull
    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.fragment_schedule_cards_item, parent, false);
        return new ScheduleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleViewHolder holder, int position) {
        holder.schedule_text.setText(list.get(position));
        final int pos = position;
        holder.schedule_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ScheduleActivity.class);
                intent.putExtra("page",pos);
                v.getContext().startActivity(intent);

            }

        });

    }

    @Override
    public int getItemCount() {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class ScheduleViewHolder extends RecyclerView.ViewHolder {
        TextView schedule_text;
        CardView schedule_cardView;

        public ScheduleViewHolder(View itemView) {
            super(itemView);
            schedule_text = itemView.findViewById(R.id.schedule_day);
            schedule_cardView = itemView.findViewById(R.id.schedule_item_cards);
        }
    }


}
