package co.tripzana.tripzana;

import android.app.Application;

/**
 * Created by Joyal on 01-06-2017.
 **/

public class TripzanaChat extends Application {

    private static boolean sIsChatActivityOpen = false;

    public static boolean isChatActivityOpen() {
        return sIsChatActivityOpen;
    }

    public static void setChatActivityOpen(boolean isChatActivityOpen) {
        TripzanaChat.sIsChatActivityOpen = isChatActivityOpen;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
