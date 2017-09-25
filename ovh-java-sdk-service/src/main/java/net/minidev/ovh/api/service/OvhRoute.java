package net.minidev.ovh.api.service;

import net.minidev.ovh.api.complextype.OvhSafeKeyValue;

/**
 * route of this service
 */
public class OvhRoute {
	/**
	 * Path to use in API
	 *
	 * canBeNull
	 */
	public String path;

	/**
	 * Variables to use in the path
	 *
	 * canBeNull
	 */
	public OvhSafeKeyValue<String>[] vars;

	/**
	 * Path with variables applyed
	 *
	 * canBeNull
	 */
	public String url;
}
