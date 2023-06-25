package om.shuklz.daggertutorial.dagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import om.shuklz.daggertutorial.car.DieselEngine;
import om.shuklz.daggertutorial.car.Engine;

@Module
public class DieselEngineModule {
    //Binds only works if the object is using constructor Injection else we have to use provides

    private int horsePower;
    public DieselEngineModule(int horsePower){
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}
