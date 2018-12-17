package net.minidev.ovh.api.order.catalog.pcc;

/**
 * Describes a Private Cloud Hypervisor
 */
public class OvhHypervisor {
	/**
	 * Describes Private Cloud Storages
	 *
	 * canBeNull && readOnly
	 */
	public OvhStorage[] storages;

	/**
	 * Describes Private Cloud Hosts
	 *
	 * canBeNull && readOnly
	 */
	public OvhHost[] hosts;

	/**
	 * Describes if an hypervisor is orderable
	 *
	 * canBeNull && readOnly
	 */
	public Boolean orderable;

	/**
	 * Name of the hypervisor
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Describes Private Cloud Options
	 *
	 * canBeNull && readOnly
	 */
	public OvhOption[] options;

	/**
	 * Type of the hypervisor
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Short Name of the hypervisor
	 *
	 * canBeNull && readOnly
	 */
	public String shortName;

	/**
	 * Describes Private Cloud Service Packs
	 *
	 * canBeNull && readOnly
	 */
	public OvhServicePack[] servicePacks;
}
