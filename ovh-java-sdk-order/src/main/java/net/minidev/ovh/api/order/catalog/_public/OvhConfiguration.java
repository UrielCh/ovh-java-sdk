package net.minidev.ovh.api.order.catalog._public;

/**
 * Describes the Configuration for a Commercial offer
 */
public class OvhConfiguration {
	/**
	 * Possible values for this Configuration, if not custom
	 *
	 * canBeNull && readOnly
	 */
	public String[] values;

	/**
	 * Whether the value of this Configuration is custom
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isCustom;

	/**
	 * Identifier of the Configuration
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Whether this Configuration is mandatory
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isMandatory;
}
