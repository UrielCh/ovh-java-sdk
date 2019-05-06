package net.minidev.ovh.api.order.catalog._public;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an Addon family for a Commercial offer
 */
public class OvhAddonFamily {
	/**
	 * Default Commercial offer that can be ordered as an Addon of the current Commercial offer for the current Family
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("default")
	public String _default;

	/**
	 * List of Commercial offers that can be ordered as an Addon of the current Commerical offer for the current Family
	 *
	 * canBeNull && readOnly
	 */
	public String[] addons;

	/**
	 * Family name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Whether this Addon family is exclusive and can be ordered only once for the main Commercial offer
	 *
	 * canBeNull && readOnly
	 */
	public Boolean exclusive;

	/**
	 * Whether this Addon family is mandatory
	 *
	 * canBeNull && readOnly
	 */
	public Boolean mandatory;
}
