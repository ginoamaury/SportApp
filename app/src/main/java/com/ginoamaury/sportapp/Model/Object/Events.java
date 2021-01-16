package com.ginoamaury.sportapp.Model.Object;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Events implements Serializable
{

    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    private final static long serialVersionUID = 7435003720785270770L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Events() {
    }

    /**
     *
     * @param events
     */
    public Events(List<Event> events) {
        super();
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }


}