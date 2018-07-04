package net.minidev.ovh.api.order.catalog.pcc;

/**
 * Describes a Private Cloud Host Hardware
 */
public class OvhHostSpecifications {
	/**
	 * Describes the memory specification of a Host
	 *
	 * canBeNull && readOnly
	 */
	public OvhHostMemorySpecifications memory;

	/**
	 * Describes the CPU specification of a Host
	 *
	 * canBeNull && readOnly
	 */
	public OvhHostCpuSpecifications cpu;

	/**
	 * Describes the network specification of a Host
	 *
	 * canBeNull && readOnly
	 */
	public OvhHostNetworkSpecifications[] network;
}
