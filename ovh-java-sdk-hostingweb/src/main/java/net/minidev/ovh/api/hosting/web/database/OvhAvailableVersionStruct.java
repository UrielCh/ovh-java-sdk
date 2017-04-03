package net.minidev.ovh.api.hosting.web.database;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database Available and Default version
 */
public class OvhAvailableVersionStruct {
	/**
	 * Database default version
	 *
	 * canBeNull
	 */
	@JsonProperty("default")
	public OvhVersionEnum _default;

	/**
	 * Database available version
	 *
	 * canBeNull
	 */
	public OvhVersionEnum[] list;
}
