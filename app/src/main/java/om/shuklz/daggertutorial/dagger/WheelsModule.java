package om.shuklz.daggertutorial.dagger;

import dagger.Module;
import dagger.Provides;
import om.shuklz.daggertutorial.car.Rims;
import om.shuklz.daggertutorial.car.Tires;
import om.shuklz.daggertutorial.car.Wheels;

//make the module abstract if all the methods are static
@Module
public abstract class WheelsModule {
    //adding static to methods improves performance as dagger doesn't has to
    //instantiate the module

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}
