package org.jasminupnp.controller.upnp;

import android.util.Log;

import org.jasminupnp.model.upnp.IRegistryListener;
import org.jasminupnp.model.upnp.IUpnpDevice;

public class UpnpDebugListener implements IRegistryListener {

	protected static final String TAG = "ClingDebugListener";

	@Override
	public void deviceAdded(final IUpnpDevice device)
	{
		Log.i(TAG, "New device detected : " + device.getDisplayString());
	}

	@Override
	public void deviceRemoved(final IUpnpDevice device)
	{
		Log.i(TAG, "Device removed : " + device.getDisplayString());
	}
}