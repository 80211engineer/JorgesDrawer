package com.example.luisgalvan.myrecicler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SpectreMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spectre_movie);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        Intent intent = getIntent();
        String textSome = intent.getStringExtra("my_key");
        int ImageSome = intent.getIntExtra("my_keyz", 0);
        String textSome2 =  intent.getStringExtra("my_keyz2");


        ImageView ImageViewSecondAct = (ImageView) findViewById(R.id.image_second_activity);
        ImageViewSecondAct.setImageResource(ImageSome);

        TextView textViewSecondActivity = (TextView) findViewById(R.id.text_view_second_activity);
        textViewSecondActivity.setText(textSome2);

        TextView textViewSecondActivity2 = (TextView) findViewById(R.id.text_view2_second_activity);
        textViewSecondActivity2.setText(textSome);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });    */
    }

}
