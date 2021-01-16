package com.ginoamaury.sportapp.View.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ginoamaury.sportapp.Interfaces.Favorite.IFavoriteView;
import com.ginoamaury.sportapp.Model.DB.SQLConnection;
import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.Presenter.FavoritePresenter;
import com.ginoamaury.sportapp.R;
import com.ginoamaury.sportapp.Util.Utility;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements Filterable{
    @Override
    public Filter getFilter() {
        return null;
    }

    private  ArrayList<Team> teams;
    private ArrayList<Team> teamsFiltered;
    private IOnTeamClick onTeamClick;
    private int typeView;

    private Context c;

    public static final int  TYPE_SHOW_PRINCIPAL = 0;
    public static final int  TYPE_SHOW_SECUNDARY = 1;


    public TeamsAdapter(ArrayList<Team> teams, IOnTeamClick onTeamClick, int typeView, Context c) {
        this.teams = teams;
        this.onTeamClick = onTeamClick;
        this.teamsFiltered = teams;
        this.typeView = typeView;
        this.c = c;
    }

    public Team getTeam (int pos){
        return teamsFiltered.get(pos);
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        View view;
        switch (typeView){
            case TYPE_SHOW_PRINCIPAL:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_list_item,parent,false);
                viewHolder = new ViewHolderShowPrincipal(view,onTeamClick,c);
                break;
            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_list_item,parent,false);
                viewHolder =  new ViewHolderShowNoElements(view);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (typeView){
            case TYPE_SHOW_PRINCIPAL:
                SQLConnection helper = SQLConnection.getInstance(c);
                Boolean fav = helper.ifExist(teamsFiltered.get(position));
                ((ViewHolderShowPrincipal) holder).setShowData(teamsFiltered.get(position),fav);
                break;
            default:

                break;
        }
    }

    @Override
    public int getItemCount() {
        return teamsFiltered.size();
    }

    public class ViewHolderShowPrincipal extends RecyclerView.ViewHolder implements IFavoriteView {

        private IOnTeamClick onTeamClick;
        @BindView(R.id.showImage)
        ImageView showImage;
        @BindView(R.id.titleTeam)
        TextView titleTeam;
        @BindView(R.id.fab)
        FloatingActionButton fab;

        FavoritePresenter favoritePresenter;
        boolean favIsActive;

        Context c;

        public ViewHolderShowPrincipal(@NonNull View itemView, IOnTeamClick onTeamClick, Context c) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            this.onTeamClick = onTeamClick;
            this.c = c;
            onClickShowCard(itemView);
            onClickFav();
            favoritePresenter = new FavoritePresenter(this);
        }

        public void setShowData(Team team, boolean fav){
           String name = team.getStrTeam();
           titleTeam.setText(name);
            favIsActive = fav;
            changeFabIcon(fab,fav);
            if(team.getStrTeamBadge()!= null){
                String urlImage = team.getStrTeamBadge();
                Utility.showImage(itemView,showImage,urlImage);
            }else{
                Utility.showImage(itemView,showImage,"noimage");
            }

        }

        private void onClickFav() {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(favIsActive){
                        favoritePresenter.deleteFav(getTeam(getAdapterPosition()),c);
                    }else {
                        favoritePresenter.addFav(getTeam(getAdapterPosition()),c);
                    }
                    onTeamClick.onTeamClick(getAdapterPosition(), Utility.CLICKADDFAV);
                }
            });
        }

        private void changeFabIcon (FloatingActionButton favIcon,boolean isActive){
            if(isActive){
                favIcon.setImageDrawable(c.getDrawable(R.drawable.ic_heart_full));
            }else{
                favIcon.setImageDrawable(c.getDrawable(R.drawable.ic_heart));
            }
        }


        private void onClickShowCard(View v){
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onTeamClick.onTeamClick(getAdapterPosition(), Utility.CLICKCARD);
                }
            });
        }

        @Override
        public void showResult(boolean result) {
            if(result){
                favIsActive = true;
                changeFabIcon(fab,true);
            }
        }

        @Override
        public void showResultDelete(boolean result) {
            if(result){
                favIsActive = false;
                changeFabIcon(fab,false);
            }
        }

        @Override
        public void showIfExist(boolean result) {
            if (result){
                favIsActive = true;
                changeFabIcon(fab,true);
            }else{
                favIsActive = false;
                changeFabIcon(fab,false);
            }
        }

        @Override
        public void showResultFavorites(ArrayList<Team> shows) {

        }


    }


    public class ViewHolderShowNoElements extends RecyclerView.ViewHolder{

        public ViewHolderShowNoElements(@NonNull View itemView) {
            super(itemView);
        }
    }


}
