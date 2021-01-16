package com.ginoamaury.sportapp.View.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.ginoamaury.sportapp.Model.Object.Event;
import com.ginoamaury.sportapp.R;
import com.ginoamaury.sportapp.Util.Utility;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolderEpisodes> implements Filterable {

    ArrayList<Event> events;
    ArrayList<Event> eventsFiltered;

    public EventAdapter(ArrayList<Event> events) {
        this.events = events;
        this.eventsFiltered = events;
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    @NonNull
    @Override
    public ViewHolderEpisodes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_event_item,parent,false);
        return new ViewHolderEpisodes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderEpisodes holder, int position) {
        holder.setEpisodeData(eventsFiltered.get(position));
    }


    @Override
    public int getItemCount() {
        return eventsFiltered.size();
    }

    public Event getEvent(int pos){
        return eventsFiltered.get(pos);
    }


    public class ViewHolderEpisodes extends RecyclerView.ViewHolder {

        @BindView(R.id.titleEvent)
        TextView title;
        @BindView(R.id.date)
        TextView date;
        @BindView(R.id.time)
        TextView time;
        @BindView(R.id.eventImage)
        ImageView image;


        public ViewHolderEpisodes(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        private void setEpisodeData (Event event){
            title.setText(event.getStrEvent());
            date.setText(event.getDateEvent());
            time.setText(event.getStrTime().substring(0,5));
            Utility.showImage(itemView,image,event.getStrThumb());

        }
    }
}
