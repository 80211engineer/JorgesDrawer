package com.example.luisgalvan.myrecicler.model;



/**
 * Created by Luis Galvan on 11/19/2015.
 */
public class Movie {


    private String mTitle;
    //private ImageView mImagem;
    private String Descrip;
    private int mImageIdz;

    public Movie(String mTitle) {
        this.mTitle = mTitle;
    }

    public Movie(String mTitle, int mId) {
        this.mTitle = mTitle;
        //this.Descrip =
        this.mImageIdz = mId;
       // this.mImagem =  mId.
    }

    public Movie(String mTitle, int mId, String descrip) {
        this.mTitle = mTitle;
        this.Descrip = descrip;
        this.mImageIdz = mId;
        // this.mImagem =  mId.
    }


    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String descrip) {
        Descrip = descrip;
    }



    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getmImageIdz() {
        return mImageIdz;
    }

    public void setmImageIdz(int mImageIdz) {
        this.mImageIdz = mImageIdz;
    }
}
