package ar.com.anura.plugins.devicesettings;
import static android.media.AudioManager.RINGER_MODE_NORMAL;
import static android.media.AudioManager.RINGER_MODE_SILENT;
import static android.media.AudioManager.RINGER_MODE_VIBRATE;
import android.media.AudioManager;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public class DeviceSettings {

    AudioManager audioManager;

    DeviceSettings(final AppCompatActivity activity) {
        audioManager = (AudioManager) activity.getSystemService(Context.AUDIO_SERVICE);
    }

    public String getRingerMode() {
        if (audioManager == null) {
            return "normal";
        }

        int mode = audioManager.getRingerMode();
        switch(mode) {
            case RINGER_MODE_NORMAL:
                return "normal";
            case RINGER_MODE_SILENT:
                return "silent";
            case RINGER_MODE_VIBRATE:
                return "vibrate";
        }

        return "normal";
    }

    public void setRingerMode(String mode) {
        int mMode = RINGER_MODE_NORMAL;
        switch(mode) {
            case "normal":
                mMode = RINGER_MODE_NORMAL;
                break;
            case "silent":
                mMode = RINGER_MODE_SILENT;
                break;
            case "vibrate":
                mMode = RINGER_MODE_VIBRATE;
                break;
        }

        audioManager.setRingerMode(mMode);
    }
}
