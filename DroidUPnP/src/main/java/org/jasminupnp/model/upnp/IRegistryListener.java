package org.jasminupnp.model.upnp;

public interface IRegistryListener {

	public void deviceAdded(final IUpnpDevice device);

	public void deviceRemoved(final IUpnpDevice device);

}
