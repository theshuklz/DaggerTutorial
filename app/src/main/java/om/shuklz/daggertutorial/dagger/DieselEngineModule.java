package om.shuklz.daggertutorial.dagger;

import dagger.Binds;
import dagger.Module;
import om.shuklz.daggertutorial.car.DieselEngine;
import om.shuklz.daggertutorial.car.Engine;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
