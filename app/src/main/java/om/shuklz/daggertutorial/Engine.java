package om.shuklz.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    private static final String TAG = "Car";
    @Inject
    public Engine(){
        Log.d(TAG, "Engine: started");
    }
}
