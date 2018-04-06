package android.rezkyaulia.com.di_train1.dependecies;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Rezky Aulia Pratama on 4/6/2018.
 */

public class Starks implements House {

    @Inject
    public Starks() {
    }

    @Override
    public void prepareForWar() {
        Log.e(getClass().getName() , " Prepare for War ");
    }

    @Override
    public void reportForWar() {
        Log.e(getClass().getName() ," reporting ...  ");

    }
}
