package net.minidev.ovh.api.order.catalog.privatecloud;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describe all capabilities of different types of service
 */
public class OvhCapabilitiesListing {
	/**
	 * Describe capabilities of default type of service
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("default")
	public OvhCapabilities _default;

	/**
	 * Describe capabilities of 2016v2 type of service
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("2016v2")
	public OvhCapabilities _2016v2;

	/**
	 * Describe capabilities of 2016v1 type of service
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("2016v1")
	public OvhCapabilities _2016v1;

	/**
	 * Describe capabilities of 2016v7 type of service
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("2016v7")
	public OvhCapabilities _2016v7;

	/**
	 * Describe capabilities of 2016v4 type of service
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("2016v4")
	public OvhCapabilities _2016v4;

	/**
	 * Describe capabilities of 2016v3 type of service
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("2016v3")
	public OvhCapabilities _2016v3;

	/**
	 * Describe capabilities of 2016v6 type of service
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("2016v6")
	public OvhCapabilities _2016v6;

	/**
	 * Describe capabilities of 2016v5 type of service
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("2016v5")
	public OvhCapabilities _2016v5;
}
