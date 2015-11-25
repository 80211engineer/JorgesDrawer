package com.example.luisgalvan.myrecicler;

import android.view.View;

import com.example.luisgalvan.myrecicler.model.Movie;

/**
 * Created by celeron on 11/21/15.
 */
public interface MyOwnListener {


    public void onItemClick(int position, View v, Movie pass);
}
