package com.example.luisgalvan.myrecicler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Toast;

import com.example.luisgalvan.myrecicler.adapter.MovieAdapter;
import com.example.luisgalvan.myrecicler.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, MyOwnListener {


    private RecyclerView mRecyclerView;

    private String TAG = " ************* * this is =  ";

    private String BondSinop ="Un mensaje secreto del pasado de Bond le envía en un sendero para descubrir una organización siniestra. Mientras M batallas de las fuerzas políticas para mantener vivo el servicio secreto, cáscaras de Bonos copia de las capas de engaño para revelar la terrible verdad detrás de SPECTRE.";

    private String CharlieSinop = "Charlie Brown, Snoopy, Lucy, Linus y el resto de la amada pandilla de \"Peanuts\" harán su debut en la pantalla grande como nunca antes han sido vistos en animación de vanguardia en 3D. Snoopy, el beagle más adorable del mundo .";
    private String thirtythree = "Protagonizada por Robert De Niro (La gran boda), Dave Bautista (Guardianes De La Galaxia) y Kate Bosworth (Siempre Alice). Un padre que no tiene los medios para pagar el tratamiento médico de su hija decide, como último recurso";

    private  EditText TextEdition;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        setUpRecyclerView();

        //TextEdition = (EditText) findViewById(R.id.text_view_second_activity);

        Log.e(TAG, " onCreate: ");


    }

    private void setUpRecyclerView() {

        mRecyclerView = (RecyclerView) findViewById(R.id.list_of_movies);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        MovieAdapter movieAdaptor = new MovieAdapter(this, createMovies());
        mRecyclerView.setAdapter(movieAdaptor);
        movieAdaptor.setMyOwnListener(this);

        Log.e(TAG, "setUpRecyclerView: " );
    }

    @Override
    public void onItemClick(int position, View v, Movie pass) {


        String mDescrip = pass.getDescrip();
        String mTitle = pass.getmTitle();
        int mImagez = pass.getmImageIdz();



        // Toast.makeText(this, " This is it" + position, Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this," FUC "+ position + "  " + mDescrip,Toast.LENGTH_LONG).show();


        //if(position == 3) {
            Intent intentActivity = new Intent(this, SpectreMovie.class);

            intentActivity.putExtra("my_key", mTitle);
            intentActivity.putExtra("my_keyz", mImagez);
            intentActivity.putExtra("my_keyz2", mDescrip);

            startActivity(intentActivity);
        //}


        Log.e(TAG, "CLICKER onItemClick: ");
    }


    private List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();


        for(int i=0; i<12; i++){

           // movies.add(new Movie("Ley de Herodes", R.drawable.cueva));
            movies.add(new Movie(BondSinop, R.drawable.spectre, "Spectrezz"));
            movies.add(new Movie(thirtythree, R.drawable.herodes, "La Ley de Herodes"));
            movies.add(new Movie(CharlieSinop, R.drawable.peanut, "Charlie Brown"));
            movies.add(new Movie(thirtythree, R.drawable.cueva, "Los 33"));
        }

        return movies;

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }



    /*

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id, View v) {

        Log.e(TAG, " $$$$$$$$  onItemClick: ");

        Toast.makeText(MainActivity.this, " This is it", Toast.LENGTH_SHORT).show();
    }

    */




}
