package by.bsu.dektiarev.pms_lab5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;

/**
 * Created by USER on 12.12.2015.
 */
public class MyReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        MainActivity act = MainActivity.getAct();
        String locationKey = LocationManager.KEY_LOCATION_CHANGED;
        if(intent.hasExtra(locationKey)) {
            Location location = (Location)intent.getExtras().get(locationKey);
            act.getLatitudeText().setText(String.valueOf(location.getLatitude()));
            act.getLongitudeText().setText(String.valueOf(location.getLongitude()));
            act.getAltitudeText().setText(String.valueOf(location.getAltitude()));
        }
    }
}
