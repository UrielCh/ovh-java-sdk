package net.minidev.ovh.api.order.catalog.pcc;

/**
 * Describes a Private Cloud Service Pack
 */
public class OvhServicePack {
	/**
	 * Name of the service pack
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Describes Option include in the service pack
	 *
	 * canBeNull && readOnly
	 */
	public OvhServicePackOption[] options;

	/**
	 * List of available service pack upgrades
	 *
	 * canBeNull && readOnly
	 */
	public String[] upgradableTo;

	/**
	 * Plan Code
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;
}
