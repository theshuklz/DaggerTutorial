package om.shuklz.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    //Here Engine is automatically injected without having to
    //setup anything because we are using constructor injection here
    @Inject
    Engine engine;
    private Wheels wheels;

    @Inject
    public Car( Wheels wheels) {
        Log.d(TAG, "Car: car initialized");
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    public void drive(){
        Log.d(TAG, "drive: driving...");
    }
}
