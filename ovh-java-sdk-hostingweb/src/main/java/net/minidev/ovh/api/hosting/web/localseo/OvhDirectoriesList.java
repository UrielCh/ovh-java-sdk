package net.minidev.ovh.api.hosting.web.localseo;

/**
 * Struct describing a list of directories ordered by type
 */
public class OvhDirectoriesList {
	/**
	 * Search engines
	 *
	 * canBeNull
	 */
	public OvhDirectory[] searchEngines;

	/**
	 * Social networks
	 *
	 * canBeNull
	 */
	public OvhDirectory[] socialNetworks;

	/**
	 * Navigation systems
	 *
	 * canBeNull
	 */
	public OvhDirectory[] navigationSystems;
}
