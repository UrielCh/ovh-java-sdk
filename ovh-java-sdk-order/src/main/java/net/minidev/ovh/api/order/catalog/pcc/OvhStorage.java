package net.minidev.ovh.api.order.catalog.pcc;

/**
 * Describes a Private Cloud Storage
 */
public class OvhStorage {
	/**
	 * Describes if filer is orderable on a upgrade order
	 *
	 * canBeNull && readOnly
	 */
	public Boolean onUpgradeOrder;

	/**
	 * Name of the filer
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Describes Private Cloud Storage specifications
	 *
	 * canBeNull && readOnly
	 */
	public OvhStorageSpecifications specifications;

	/**
	 * Describes if filer is orderable on a initial Order
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
