package org.jasminupnp.model.upnp.didl;

import org.jasminupnp.R;
import org.jasminupnp.model.upnp.IUpnpDevice;
import org.jasminupnp.view.DeviceDisplay;

public class DIDLDevice implements IDIDLObject {

	IUpnpDevice device;

	public DIDLDevice(IUpnpDevice device)
	{
		this.device = device;
	}

	public IUpnpDevice getDevice()
	{
		return device;
	}

	@Override
	public String getDataType()
	{
		return "";
	}

	@Override
	public String getTitle() {
		return (new DeviceDisplay(device)).toString();
	}

	@Override
	public String getDescription() {
		return "";
	}

	@Override
	public String getCount() {
		return "";
	}

	@Override
	public int getIcon() {
		return R.drawable.ic_action_collection;
	}

	@Override
	public String getParentID() {
		return "";
	}

	@Override
	public String getId() {
		return "";
	}
}
