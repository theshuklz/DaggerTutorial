package om.shuklz.daggertutorial;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
     Engine provideEngine(PetrolEngine engine){
        return engine;
    }
}
