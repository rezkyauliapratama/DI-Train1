package android.rezkyaulia.com.di_train1.dependecies;

import javax.inject.Inject;

/**
 * Created by Rezky Aulia Pratama on 4/6/2018.
 */


public class War {

    private Starks starks;
    private Boltons boltons;

    //DI - getting dependencies from else where via constructor
    @Inject
    public War(Starks starks, Boltons bolton){
        this.starks = starks;
        this.boltons = bolton;
    }

    public void prepare(){
        starks.prepareForWar();
        boltons.prepareForWar();
    }

    public void report(){
        starks.reportForWar();
        boltons.reportForWar();
    }

}
