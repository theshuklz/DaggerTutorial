package om.shuklz.daggertutorial.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{
    private static final String TAG = "Car";

    @Inject DieselEngine(){}

    @Override
    public void start() {
        Log.d(TAG, "start: Diesel Engine Started");
    }
}
