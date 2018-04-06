package android.rezkyaulia.com.di_train1.dependecies;

import dagger.Component;

/**
 * Created by Rezky Aulia Pratama on 4/6/2018.
 */
@Component
public interface BattleComponent {

    War getWar();
    Starks getStarks();
    Boltons getBoltons();

}
