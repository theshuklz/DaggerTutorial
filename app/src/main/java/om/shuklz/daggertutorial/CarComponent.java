package om.shuklz.daggertutorial;

import dagger.Component;

@Component
public interface CarComponent {
    //Component creates the dependency acyclic graph
    //This is the injector, it can inject in provision methods, constructor or fields

    //name doesn't matter
    Car getCar();
}
