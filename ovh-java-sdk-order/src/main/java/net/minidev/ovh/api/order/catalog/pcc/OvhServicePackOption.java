package net.minidev.ovh.api.order.catalog.pcc;

/**
 * Describes a Private Cloud service pack option
 */
public class OvhServicePackOption {
	/**
	 * Name of the option
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Category of the option
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Plan Code
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;
}
