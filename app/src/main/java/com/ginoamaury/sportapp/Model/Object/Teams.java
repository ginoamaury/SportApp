package com.ginoamaury.sportapp.Model.Object;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Teams implements Serializable
{

    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;
    private final static long serialVersionUID = -1314934566809676749L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Teams() {
    }

    /**
     *
     * @param teams
     */
    public Teams(List<Team> teams) {
        super();
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }



}