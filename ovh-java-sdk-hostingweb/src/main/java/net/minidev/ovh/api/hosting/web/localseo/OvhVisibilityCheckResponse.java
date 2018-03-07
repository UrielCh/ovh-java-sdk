package net.minidev.ovh.api.hosting.web.localseo;

/**
 * Struct describing the response for a visibility check request
 */
public class OvhVisibilityCheckResponse {
	/**
	 * Is the searched location already managed ?
	 *
	 * canBeNull
	 */
	public Boolean alreadyManaged;

	/**
	 * Searched location data
	 *
	 * canBeNull
	 */
	public OvhSearchData searchData;
}
