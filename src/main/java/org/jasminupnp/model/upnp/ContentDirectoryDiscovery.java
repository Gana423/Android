package org.jasminupnp.model.upnp;

import org.jasminupnp.Main;

public class ContentDirectoryDiscovery extends DeviceDiscovery {

	protected static final String TAG = "ContentDirectoryDeviceFragment";

	public ContentDirectoryDiscovery(IServiceListener serviceListener)
	{
		super(serviceListener);
	}

	@Override
	protected ICallableFilter getCallableFilter()
	{
		return new CallableContentDirectoryFilter();
	}

	@Override
	protected boolean isSelected(IUpnpDevice device)
	{
		if (Main.upnpServiceController != null && Main.upnpServiceController.getSelectedContentDirectory() != null)
			return device.equals(Main.upnpServiceController.getSelectedContentDirectory());

		return false;
	}

	@Override
	protected void select(IUpnpDevice device)
	{
		select(device, false);
	}

	@Override
	protected void select(IUpnpDevice device, boolean force)
	{
		Main.upnpServiceController.setSelectedContentDirectory(device, force);
	}

	@Override
	protected void removed(IUpnpDevice d)
	{
		if (Main.upnpServiceController != null && Main.upnpServiceController.getSelectedContentDirectory() != null
				&& d.equals(Main.upnpServiceController.getSelectedContentDirectory()))
			Main.upnpServiceController.setSelectedContentDirectory(null);
	}
}
