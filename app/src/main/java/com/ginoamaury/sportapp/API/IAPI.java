package com.ginoamaury.sportapp.API;



import com.ginoamaury.sportapp.Model.Object.Events;
import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.Model.Object.Teams;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IAPI {

    // SHOW ALL TEAMS FROM A LEAGUE
    @GET("search_all_teams.php")
    Call<Teams> getTeamsFromLeague(@Query("l") String query);

    @GET("eventsnext.php")
    Call<Events> getEventsFromTeam (@Query("id") int query);

}
