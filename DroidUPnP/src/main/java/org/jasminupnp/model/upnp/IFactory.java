package org.jasminupnp.model.upnp;

import android.content.Context;

import org.jasminupnp.controller.upnp.IUpnpServiceController;

public interface IFactory {
	public IContentDirectoryCommand createContentDirectoryCommand();

	public IUpnpServiceController createUpnpServiceController(Context ctx);

	public ARendererState createRendererState();

	public IRendererCommand createRendererCommand(IRendererState rs);
}
