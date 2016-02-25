package com.bassanidevelopment.santiago.grouprequest;

/**
 * Created by santiago on 2/21/16.
 */
import com.firebase.client.Firebase;

public class GroupRequest extends android.app.Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
