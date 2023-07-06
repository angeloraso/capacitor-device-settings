import { WebPlugin } from '@capacitor/core';

import type { DeviceSettingsPlugin } from './definitions';

export class DeviceSettingsWeb
  extends WebPlugin
  implements DeviceSettingsPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
