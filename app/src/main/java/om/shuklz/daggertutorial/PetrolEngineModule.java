package om.shuklz.daggertutorial;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
     abstract Engine bindsEngine(PetrolEngine engine);
}
