package ar.com.anura.plugins.devicesettings;

import android.util.Log;

public class DeviceSettings {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
