package com.hyperdev.androidme.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.hyperdev.androidme.R;
import com.hyperdev.androidme.data.AndroidImageAssets;

public class MainActivity extends AppCompatActivity {


    headfragment headfragment = new headfragment();
    bodyfragment bodyfragment = new bodyfragment();
    legfragment legfragment = new legfragment();
    private AndroidImageAssets assets = new AndroidImageAssets();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findviews();


    }

    public void findviews(){

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.HeadLayout,headfragment,headfragment.getTag())
                .commit();


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.BodyLayout,bodyfragment,bodyfragment.getTag())
                .commit();


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.LegLayout,legfragment,legfragment.getTag())
                .commit();
    }

    public void HeadChanger(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.HeadLayout,assets,assets.getTag())
                .commit();
    }

    public void BodyChanger() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.BodyLayout,assets,assets.getTag())
                .commit();
    }

    public void LegChanger() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.LegLayout,assets,assets.getTag())
                .commit();
    }

}
