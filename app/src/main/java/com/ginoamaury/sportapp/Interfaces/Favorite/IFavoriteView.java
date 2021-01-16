package com.ginoamaury.sportapp.Interfaces.Favorite;

import com.ginoamaury.sportapp.Model.Object.Team;

import java.util.ArrayList;

public interface IFavoriteView {
    void showResult (boolean result);
    void showResultDelete (boolean result);
    void showIfExist (boolean result);
    void showResultFavorites (ArrayList<Team> teams);
}
