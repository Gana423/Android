package org.jasminupnp.model.upnp;

import org.jasminupnp.view.ContentDirectoryFragment;

public interface IContentDirectoryCommand
{
	public void browse(String directoryID, final String parent, final ContentDirectoryFragment.ContentCallback callback);

	public void search(String search, final String parent, final ContentDirectoryFragment.ContentCallback callback);

	public boolean isSearchAvailable();
}
