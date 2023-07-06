import { registerPlugin } from '@capacitor/core';

import type { DeviceSettingsPlugin } from './definitions';

const DeviceSettings = registerPlugin<DeviceSettingsPlugin>('DeviceSettings', {
  web: () => import('./web').then(m => new m.DeviceSettingsWeb()),
});

export * from './definitions';
export { DeviceSettings };
