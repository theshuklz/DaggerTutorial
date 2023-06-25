package om.shuklz.daggertutorial.dagger;

import dagger.Binds;
import dagger.Module;
import om.shuklz.daggertutorial.car.Engine;
import om.shuklz.daggertutorial.car.PetrolEngine;

@Module
public abstract class PetrolEngineModule {

    @Binds
     abstract Engine bindsEngine(PetrolEngine engine);
}
