package net.minidev.ovh.api.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
public class OvhContainerDetail {
	/**
	 * Is container public
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("public")
	public Boolean _public;

	/**
	 * Objects stored in container
	 *
	 * canBeNull && readOnly
	 */
	public OvhObject[] objects;

	/**
	 * Total bytes stored
	 *
	 * canBeNull && readOnly
	 */
	public int stored;

	/**
	 * Container name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Total objects stored
	 *
	 * canBeNull && readOnly
	 */
	public int totalObjects;

	/**
	 * URL to use in CNAME when container is configured for static website
	 *
	 * canBeNull && readOnly
	 */
	public String staticUrl;
}
