package net.minidev.ovh.api.order.catalog.pcc;

/**
 * Describes a Private Cloud Host
 */
public class OvhHost {
	/**
	 * Describes if host is orderable on a upgrade order
	 *
	 * canBeNull && readOnly
	 */
	public Boolean onUpgradeOrder;

	/**
	 * List of filers add in case of a Pack order
	 *
	 * canBeNull && readOnly
	 */
	public String[] storagesPack;

	/**
	 * Name of the host
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Describes Private Cloud Host specifications
	 *
	 * canBeNull && readOnly
	 */
	public OvhHostSpecifications specifications;

	/**
	 * Describes if host is orderable on a initial Order
	 *
	 * canBeNull && readOnly
	 */
	public Boolean onInitialOrder;

	/**
	 * Plan Code
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;
}
