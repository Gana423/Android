package org.jasminupnp.controller.cling;

import android.content.Context;

import org.jasminupnp.Main;
import org.jasminupnp.controller.upnp.IUpnpServiceController;
import org.jasminupnp.model.cling.RendererState;
import org.jasminupnp.model.upnp.ARendererState;
import org.jasminupnp.model.upnp.IContentDirectoryCommand;
import org.jasminupnp.model.upnp.IFactory;
import org.jasminupnp.model.upnp.IRendererCommand;
import org.jasminupnp.model.upnp.IRendererState;
import org.fourthline.cling.android.AndroidUpnpService;
import org.fourthline.cling.controlpoint.ControlPoint;

public class Factory implements IFactory {

	@Override
	public IContentDirectoryCommand createContentDirectoryCommand()
	{
		AndroidUpnpService aus = ((ServiceListener) Main.upnpServiceController.getServiceListener()).getUpnpService();
		ControlPoint cp = null;
		if (aus != null)
			cp = aus.getControlPoint();
		if (cp != null)
			return new ContentDirectoryCommand(cp);

		return null;
	}

	@Override
	public IRendererCommand createRendererCommand(IRendererState rs)
	{
		AndroidUpnpService aus = ((ServiceListener) Main.upnpServiceController.getServiceListener()).getUpnpService();
		ControlPoint cp = null;
		if (aus != null)
			cp = aus.getControlPoint();
		if (cp != null)
			return new RendererCommand(cp, (RendererState) rs);

		return null;
	}

	@Override
	public IUpnpServiceController createUpnpServiceController(Context ctx)
	{
		return new ServiceController(ctx);
	}

	@Override
	public ARendererState createRendererState()
	{
		return new RendererState();
	}
}
