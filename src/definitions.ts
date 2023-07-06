export interface DeviceSettingsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
