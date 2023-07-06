import { WebPlugin } from '@capacitor/core';

import type { DeviceSettingsPlugin, RingerMode } from './definitions';

export class DeviceSettingsWeb
  extends WebPlugin
  implements DeviceSettingsPlugin
{
  async getRingerMode(): Promise<RingerMode>{
    throw this.unimplemented('Not implemented on web.');
  }

  async setRingerMode(_data: {mode: RingerMode}): Promise<void>{
    throw this.unimplemented('Not implemented on web.');
  }
}
