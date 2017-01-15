package ninja.paranoidandroid.mysyncadapter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AuthenticatorService extends Service {

    private MyAccountAuthenticator mMyAccountAuthenticator;

    public AuthenticatorService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mMyAccountAuthenticator = new MyAccountAuthenticator(this);

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mMyAccountAuthenticator.getIBinder();
    }
}
