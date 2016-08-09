package alissapaluska.deadoralive.util;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by ali on 8/7/16.
 */
public class DeadorAliveApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
