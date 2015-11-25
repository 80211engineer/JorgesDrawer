package com.example.luisgalvan.myrecicler.adapter;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luisgalvan.myrecicler.MyOwnListener;
import com.example.luisgalvan.myrecicler.R;
import com.example.luisgalvan.myrecicler.model.Movie;

import java.util.List;


/**
 * Created by Luis Galvan on 11/19/2015.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private List<Movie> mMovies;
    private LayoutInflater mInflater;

    private ImageView mImagin;

    private MyOwnListener myOwnListener;
    private String TAG = " This is it ";

    public int track;


    public MovieAdapter(Context context, List<Movie> movies) {
        mInflater = LayoutInflater.from(context);
        this.mMovies = movies;
    }


    public void setMyOwnListener(MyOwnListener myOwnListener1){

        this.myOwnListener = myOwnListener1;
        Log.e(TAG, "setMyOwnListener: ");
    }



    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.li_movies, parent, false);
       // MovieViewHolder viewHolder = new MovieViewHolder(view);
        MovieViewHolder viewHolder = new MovieViewHolder(view, R.id.image_movie, R.id.text_movie);




        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie curz = mMovies.get(position);

        holder.setmTitle(curz.getmTitle());
        holder.setmImage(curz.getmImageIdz());
        holder.setmDescrip(curz.getDescrip());

        track = position;
        Log.e(TAG, " $$$$$$$  onBindViewHolder: " + curz.getDescrip());

    }


    public Movie printerMonitor(){
        Movie star = mMovies.get(track);

      return star;
    }


    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        private TextView mTitle;
        private ImageView mImage;
        private TextView mDescrip;

        public MovieViewHolder(View itemView, int idImage, int idText) {
            super(itemView);

            itemView.setOnClickListener(this);

            mTitle = (TextView) itemView.findViewById(R.id.text_movie);
            mImage = (ImageView) itemView.findViewById(R.id.image_movie);
            mDescrip = (TextView) itemView.findViewById(R.id.Description_movie);
            //mImagin = (ImageView) itemView.findViewById(R.id.image_movie);

            //mImage.setOnClickListener(this);

        }






        public void setmDescrip(String mDescrip) {
            this.mDescrip.setText(mDescrip);
        }

        public void setmImage(int idz) {
            this.mImage.setImageResource(idz);
            //this.mImagin.setImageResource(idz);
        }

        public void setmTitle(String titlez) {
            this.mTitle.setText(titlez);

        }


        @Override
        public void onClick(View v) {

            Movie pass = mMovies.get(getAdapterPosition());

            myOwnListener.onItemClick(getAdapterPosition(), v, pass);
        }
    }


}
