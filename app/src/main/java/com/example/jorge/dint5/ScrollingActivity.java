package com.example.jorge.dint5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class ScrollingActivity extends AppCompatActivity {

    ScrollingActivityEvents events;
    FloatingActionButton fab,fab1,fab2,fab3;
    Animation show_fab1,hide_fab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        events=new ScrollingActivityEvents(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(events);

        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab1.setOnClickListener(events);

        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab2.setOnClickListener(events);

        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        fab3.setOnClickListener(events);

        show_fab1 = AnimationUtils.loadAnimation(this,R.anim.fab1_show);
        hide_fab1 = AnimationUtils.loadAnimation(this,R.anim.fab1_hide);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showFabs(){
        //FrameLayout.LayoutParams layoutParams=(FrameLayout.LayoutParams)fab1.getLayoutParams();
        //layoutParams.rightMargin+=(int)(fab1.getWidth()*1.7);
        //layoutParams.bottomMargin+=(int)(fab1.getHeight()*0.25);
        //fab1.setLayoutParams(layoutParams);
        //fab1.startAnimation(show_fab1);
    }

    public void hideFabs(){
        Log.v("scrollingActivity", "hideFabs");
        fab1.startAnimation(hide_fab1);
    }
}

