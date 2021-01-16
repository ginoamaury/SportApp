package com.ginoamaury.sportapp.Interactors;

import com.ginoamaury.sportapp.API.API;
import com.ginoamaury.sportapp.Interfaces.Events.IEventsIterator;
import com.ginoamaury.sportapp.Model.Object.Event;
import com.ginoamaury.sportapp.Model.Object.Events;
import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.Model.Object.Teams;
import com.ginoamaury.sportapp.Presenter.EventPresenter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventInteractor implements IEventsIterator, Callback<Events> {

     EventPresenter eventPresenter;

    public EventInteractor(EventPresenter eventPresenter) {
        this.eventPresenter = eventPresenter;
    }

    @Override
    public void getEvents(int team) {
        Call<Events> api = API.getApi().getEventsFromTeam(team);
        api.enqueue(this);
    }


    @Override
    public void onResponse(Call<Events> call, Response<Events> response) {
        try{
            if(response.isSuccessful()){
                Events events  =  response.body();
                if(events != null){
                    ArrayList<Event> eventsQuery = (ArrayList<Event>) events.getEvents();
                    eventPresenter.showResult(eventsQuery);
                }else{
                    eventPresenter.showResult(null);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            eventPresenter.showResult(null);
        }
    }

    @Override
    public void onFailure(Call<Events> call, Throwable t) {
        eventPresenter.showResult(null);
    }
}
