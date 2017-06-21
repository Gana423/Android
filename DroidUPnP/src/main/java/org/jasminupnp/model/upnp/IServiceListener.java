package org.jasminupnp.model.upnp;

import android.content.ServiceConnection;

import java.util.Collection;

public interface IServiceListener {

	public void addListener(IRegistryListener registryListener);

	public void removeListener(IRegistryListener registryListener);

	public void clearListener();

	public void refresh();

	public Collection<IUpnpDevice> getDeviceList();

	public Collection<IUpnpDevice> getFilteredDeviceList(ICallableFilter filter);

	public ServiceConnection getServiceConnexion();
}
