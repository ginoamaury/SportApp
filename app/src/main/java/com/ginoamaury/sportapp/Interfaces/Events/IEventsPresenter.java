package com.ginoamaury.sportapp.Interfaces.Events;

import com.ginoamaury.sportapp.Model.Object.Event;

import java.util.ArrayList;

public interface IEventsPresenter {
    void getEvents (int team);
    void showResult(ArrayList<Event> events);
}
