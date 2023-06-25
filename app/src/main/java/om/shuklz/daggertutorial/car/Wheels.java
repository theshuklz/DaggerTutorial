package om.shuklz.daggertutorial.car;

import android.util.Log;

public class Wheels {
    private static final String TAG = "Car";
    // we dont own this class so can't use constructor injection

    private Rims rims;
    private Tires tires;
    public Wheels(Rims rims, Tires tires){
        Log.d(TAG, "Wheels: Wheels created");
        this.rims = rims;
        this.tires = tires;
    }
}
