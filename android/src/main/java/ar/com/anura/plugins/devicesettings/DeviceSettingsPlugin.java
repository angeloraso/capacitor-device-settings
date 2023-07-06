package ar.com.anura.plugins.devicesettings;

import androidx.appcompat.app.AppCompatActivity;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "DeviceSettings")
public class DeviceSettingsPlugin extends Plugin {

    private DeviceSettings deviceSettings;

    public void load() {
        AppCompatActivity activity = getActivity();
        deviceSettings = new DeviceSettings(activity);
    }

    @PluginMethod
    public void getRingerMode(PluginCall call) {
        if (getActivity().isFinishing()) {
            call.reject("Device settings plugin error: App is finishing");
            return;
        }

        JSObject ret = new JSObject();
        ret.put("mode", deviceSettings.getRingerMode());
        call.resolve(ret);
    }

    @PluginMethod
    public void setRingerMode(PluginCall call) {
        if (getActivity().isFinishing()) {
            call.reject("Device settings plugin error: App is finishing");
            return;
        }

        String mode = call.getString("mode", "normal");
        deviceSettings.setRingerMode(mode);

        call.resolve();
    }
}
