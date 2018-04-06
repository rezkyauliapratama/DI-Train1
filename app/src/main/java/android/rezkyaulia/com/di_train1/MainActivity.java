package android.rezkyaulia.com.di_train1;

import android.rezkyaulia.com.di_train1.dependecies.BattleComponent;
import android.rezkyaulia.com.di_train1.dependecies.Boltons;
import android.rezkyaulia.com.di_train1.dependecies.DaggerBattleComponent;
import android.rezkyaulia.com.di_train1.dependecies.Starks;
import android.rezkyaulia.com.di_train1.dependecies.War;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Starks starks;
    private Boltons boltons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hard dependencies
        /*war();*/

        //        Mannual DI
//        Starks starks = new Starks();
//        Boltons boltons = new Boltons();
//        War war = new War(starks,boltons);
//        war.prepare();
//        war.report();

//      Using Dagger 2
        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();
    }

    //hard dependencies
    /*void war(){
        starks = new Starks();
        boltons = new Boltons();

        starks.prepareForWar();
        starks.reportForWar();
        boltons.prepareForWar();
        starks.reportForWar();
    }*/
}
