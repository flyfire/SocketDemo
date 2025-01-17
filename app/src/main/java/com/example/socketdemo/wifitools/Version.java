package com.example.socketdemo.wifitools;

import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;

import java.lang.reflect.Field;

;

/**
 * Get Android version in different Android versions. :)
 * @author yuanxiaohui
 *
 */
public class Version {
	
	public final static int SDK = get();
	
	private static int get() {
		 final Class<VERSION> versionClass = VERSION.class;
		 try {
			 // First try to read the recommended field android.os.Build.VERSION.SDK_INT.
			final Field sdkIntField = versionClass.getField("SDK_INT");
			int ret0 = sdkIntField.getInt(null);
			 Log.d("solarex", "ret0 = " + ret0);
			 int ret1 = VERSION.SDK_INT;
			 Log.d("solarex", "ret1 = " + ret1);
			return sdkIntField.getInt(null);
		}catch (NoSuchFieldException e) {
			// If SDK_INT does not exist, read the deprecated field SDK.
			return Integer.valueOf(VERSION.SDK);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
