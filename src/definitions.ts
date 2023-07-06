export interface IRingerMode {
  mode: 'normal' ;
}

export type RingerMode = 'normal' | 'silent' | 'vibrate'; 
export interface DeviceSettingsPlugin {
  getRingerMode(): Promise<RingerMode>;
  setRingerMode(data: { mode: RingerMode }): Promise<void>;
}
