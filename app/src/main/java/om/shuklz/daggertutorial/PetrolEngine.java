package om.shuklz.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{
    private static final String TAG = "Car";
    @Inject
    PetrolEngine(){}

    @Override
    public void start() {
        Log.d(TAG, "start: Petrol engine started");
    }
}
