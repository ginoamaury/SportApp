package com.ginoamaury.sportapp.Presenter;

import com.ginoamaury.sportapp.Interactors.EventInteractor;
import com.ginoamaury.sportapp.Interfaces.Events.IEventsPresenter;
import com.ginoamaury.sportapp.Interfaces.Events.IEventsView;
import com.ginoamaury.sportapp.Model.Object.Event;

import java.util.ArrayList;

public class EventPresenter  implements IEventsPresenter {

    IEventsView eventsView;
    EventInteractor eventInteractor;

    public EventPresenter(IEventsView eventsView) {
        this.eventsView = eventsView;
        eventInteractor =  new EventInteractor(this);
    }

    @Override
    public void getEvents(int team) {
        eventInteractor.getEvents(team);
    }

    @Override
    public void showResult(ArrayList<Event> events) {
        eventsView.showResult(events);
    }
}
