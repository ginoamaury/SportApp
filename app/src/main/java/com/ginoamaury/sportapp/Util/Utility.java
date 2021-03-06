package com.ginoamaury.sportapp.Util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.signature.ObjectKey;
import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class Utility {

    public static final String TABLE_FAVORITE="favorite";
    public static final String ATRIBUTE_TEAM_ID="id";
    public static final String ATRIBUTE_TEAM_NAME="name";
    public static final String ATRIBUTE_TEAM_IMAGE="image";

    //SQL
    public static final String CREATE_TABLE_FAV = "CREATE TABLE "+TABLE_FAVORITE+
            "("+
            ATRIBUTE_TEAM_ID+" INTEGER PRIMARY KEY,"+
            ATRIBUTE_TEAM_NAME+" TEXT,"+
            ATRIBUTE_TEAM_IMAGE+ " TEXT)";



    //Static String Card Product
    public static final String CLICKCARD="cardTeam";
    public static final String CLICKADDFAV="addTeamFavorite";



    public static String getPreference(Context c, String preference ,String key){
        SharedPreferences preferences = c.getSharedPreferences(preference, Context.MODE_PRIVATE);
        return preferences.getString(key,c.getString(R.string.noData));
    }

    public static boolean setPreference(Context c, String preference ,String key, String data){
        try{
            SharedPreferences preferences = c.getSharedPreferences(preference, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(key,data);
            editor.apply();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void showSnackbarTopMsg (View v, Context context, String msg){
        Snackbar snack = Snackbar.make(v, msg, Snackbar.LENGTH_LONG);
        View view = snack.getView();
        FrameLayout.LayoutParams params =(FrameLayout.LayoutParams)view.getLayoutParams();
        params.gravity = Gravity.TOP;
        view.setLayoutParams(params);
        snack.show();
    }

    public static void showSnackbar (View v, Context context, int idString){
        Snackbar.make(v, context.getResources().getString(idString), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public static void showImage (View itemView,ImageView imageView,String url){
        RequestOptions requestOptions = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .signature(new ObjectKey("GLIDEIMAGES"));

        Glide.with(itemView).load(url)
                .thumbnail(0.25f)
                .error(R.drawable.ic_no_photo)
                .fallback(R.drawable.ic_no_photo)
                .apply(requestOptions).into(imageView);
    }

    public static void showImage (Context itemView,ImageView imageView,String url){
        RequestOptions requestOptions = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .signature(new ObjectKey("GLIDEIMAGES"));

        Glide.with(itemView).load(url)
                .thumbnail(0.25f)
                .error(R.drawable.ic_no_photo)
                .fallback(R.drawable.ic_no_photo)
                .apply(requestOptions).into(imageView);
    }

    public static void goToNextActivityCleanStackTeam(Activity activity, Class clase, boolean finaliza, ArrayList<Extra> params, Team team)
    {
        Intent intent = new Intent(activity, clase ).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.putExtra("TEAM", team);
        if(params!=null){
            for (Extra param: params) {
                intent.putExtra(param.getClave(),param.getValor());
            }
        }
        activity.startActivity(intent);

        if (finaliza){
            activity.finish();
        }
    }


    public static void goToNextActivityCleanStack(Activity activity, Class clase, boolean finaliza, ArrayList<Extra> params)
    {
        Intent intent = new Intent(activity, clase ).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        if(params!=null){
            for (Extra param: params) {
                intent.putExtra(param.getClave(),param.getValor());
            }
        }
        activity.startActivity(intent);

        if (finaliza){
            activity.finish();
        }
    }

    public static boolean veirifyConnection (Activity activity){
        ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        } else {
            View contextView = activity.getCurrentFocus();
            Snackbar.make(contextView, activity.getResources().getString(R.string.errConnect), Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            return false;
        }

    }

    public static class Extra {
        private String clave;
        private String valor;

        public Extra(String clave, String valor) {
            this.clave = clave;
            this.valor = valor;
        }

        public String getClave() {
            return clave;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }
    }
}
