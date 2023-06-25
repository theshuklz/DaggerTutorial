package om.shuklz.daggertutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import om.shuklz.daggertutorial.car.Car;
import om.shuklz.daggertutorial.dagger.CarComponent;
import om.shuklz.daggertutorial.dagger.DaggerCarComponent;
import om.shuklz.daggertutorial.dagger.DieselEngineModule;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100)).build();
        //we have to do this for field injection
        //Field and method injection are automatically executed if only we do
        //constructor injection. Since we can't do it in main activity, we have to inject it manually
        component.injectFieldsIn(this);
        car.drive();
    }
}