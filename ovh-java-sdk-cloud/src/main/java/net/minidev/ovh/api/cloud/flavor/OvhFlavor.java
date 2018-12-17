package net.minidev.ovh.api.cloud.flavor;

/**
 * Flavor
 */
public class OvhFlavor {
	/**
	 * Max capacity of outbound traffic in Mbit/s
	 *
	 * canBeNull && readOnly
	 */
	public Long outboundBandwidth;

	/**
	 * Number of disks
	 *
	 * canBeNull && readOnly
	 */
	public Long disk;

	/**
	 * Max capacity of inbound traffic in Mbit/s
	 *
	 * canBeNull && readOnly
	 */
	public Long inboundBandwidth;

	/**
	 * Plan codes to order instances
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlavorPlanCodes planCodes;

	/**
	 * Flavor name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * OS to install on
	 *
	 * canBeNull && readOnly
	 */
	public String osType;

	/**
	 * Available in stock
	 *
	 * canBeNull && readOnly
	 */
	public Boolean available;

	/**
	 * Flavor id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Number of VCPUs
	 *
	 * canBeNull && readOnly
	 */
	public Long vcpus;

	/**
	 * Flavor region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Flavor type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Ram quantity (Gio)
	 *
	 * canBeNull && readOnly
	 */
	public Long ram;
}
