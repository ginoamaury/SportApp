package com.ginoamaury.sportapp.Interfaces.Favorite;

import android.content.Context;

import com.ginoamaury.sportapp.Model.Object.Team;


public interface IFavoriteInteractor {
    void addFav(Team team, Context c);
    void deleteFav(Team team,Context c);
    void findFav(Team team,Context c);
    void getFavorites(Context c);
}
