package om.shuklz.daggertutorial;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    //Component creates the dependency acyclic graph
    //This is the injector, it can inject in provision methods, constructor or fields

    //name doesn't matter
    Car getCar();
    void injectFieldsIn(MainActivity activity);
}
