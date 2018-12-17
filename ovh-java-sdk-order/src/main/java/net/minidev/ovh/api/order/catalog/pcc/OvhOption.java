package net.minidev.ovh.api.order.catalog.pcc;

/**
 * Describes a Private Cloud Option
 */
public class OvhOption {
	/**
	 * Describes if option is orderable on a upgrade order
	 *
	 * canBeNull && readOnly
	 */
	public Boolean onUpgradeOrder;

	/**
	 * Name of the option
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Describes the maximum quantity on the initial order
	 *
	 * canBeNull && readOnly
	 */
	public Long maxInitialQuantity;

	/**
	 * Category of the option
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Describes if option is orderable on a initial order
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
