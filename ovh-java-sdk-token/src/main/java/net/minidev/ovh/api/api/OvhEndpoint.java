package net.minidev.ovh.api.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
public class OvhEndpoint {
	/**
	 * canBeNull && readOnly
	 */
	public String legacy_endpoint_id;

	/**
	 * canBeNull && readOnly
	 */
	public String region_id;

	/**
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * canBeNull && readOnly
	 */
	@JsonProperty("interface")
	public String _interface;

	/**
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * canBeNull && readOnly
	 */
	public String url;
}
