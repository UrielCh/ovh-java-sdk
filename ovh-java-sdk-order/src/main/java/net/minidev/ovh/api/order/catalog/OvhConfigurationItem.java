package net.minidev.ovh.api.order.catalog;

/**
 * Composition of a configuration
 */
public class OvhConfigurationItem {
	/**
	 * Default value of the configuration if not provided
	 *
	 * canBeNull && readOnly
	 */
	public String defaultValue;

	/**
	 * Values allowed if configuration isn't custom
	 *
	 * canBeNull && readOnly
	 */
	public String[] values;

	/**
	 * Label of the configuration
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Indicates if the configuration is free for writing (true) or have to follow an enum (false - have to follow values field)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isCustom;

	/**
	 * Indicates if configuration is required
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isMandatory;
}
