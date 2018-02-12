package com.example.jorge.dint5;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by jorge on 12/02/2018.
 */

public class ScrollingActivityEvents implements View.OnClickListener{
    ScrollingActivity scrollingActivity;
    boolean blFabsVisible=false;

    public ScrollingActivityEvents( ScrollingActivity scrollingActivity){
       this.scrollingActivity=scrollingActivity;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.fab){
            //Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
            //        .setAction("Action", null).show();
            if (!blFabsVisible){
                scrollingActivity.showFabs();
            }else{
                scrollingActivity.hideFabs();
            }
            blFabsVisible=!blFabsVisible;
        }
    }
}
