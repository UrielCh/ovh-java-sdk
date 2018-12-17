package net.minidev.ovh.api.docker.slave;

/**
 * Attributes of the slave flavor
 */
public class OvhFlavor {
	/**
	 * Whether the flavor is an Openstack or dedicated flavor
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isVm;

	/**
	 * The disk size, in GB
	 *
	 * canBeNull && readOnly
	 */
	public Long disk;

	/**
	 * Wether the disk is HA (stored in Ceph) or local (SSD)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean diskHa;

	/**
	 * The amount of (v)CPUs
	 *
	 * canBeNull && readOnly
	 */
	public Long cpus;

	/**
	 * The network bandwidth, in Mbps
	 *
	 * canBeNull && readOnly
	 */
	public Long bandwidth;

	/**
	 * The flavor UUID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * The amount of RAM, in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long ram;
}
