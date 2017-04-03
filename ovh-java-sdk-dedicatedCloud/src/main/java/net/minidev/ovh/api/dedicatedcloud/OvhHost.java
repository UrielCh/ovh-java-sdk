package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.dedicatedcloud.host.OvhStateEnum;
import net.minidev.ovh.api.dedicatedcloud.ressources.OvhBillingTypeEnum;

/**
 * Private Cloud Host
 */
public class OvhHost {
	/**
	 * Rack of the host
	 *
	 * canBeNull && readOnly
	 */
	public String rack;

	/**
	 * Host is in maintenance mode
	 *
	 * canBeNull && readOnly
	 */
	public Boolean inMaintenance;

	/**
	 * Current cpu utilization, in Mhz
	 *
	 * canBeNull && readOnly
	 */
	public Long cpuUsed;

	/**
	 * Connection state of the host
	 *
	 * canBeNull && readOnly
	 */
	public OvhHostSystemConnectionState connectionState;

	/**
	 * Host profile in a commercial range
	 *
	 * canBeNull && readOnly
	 */
	public String profile;

	/**
	 * CPU total frenquency
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> cpu;

	/**
	 * Id of the host
	 *
	 * canBeNull && readOnly
	 */
	public Long hostId;

	/**
	 * The maximum speed of the cpu, in Mhz
	 *
	 * canBeNull && readOnly
	 */
	public Long cpuMax;

	/**
	 * Amount of used memory. Sum of the memory used by all powered on virtual machines and vSphere services on the host. in MB
	 *
	 * canBeNull && readOnly
	 */
	public Double memoryUsed;

	/**
	 * Number of Vcpu use by virtual machines on the host
	 *
	 * canBeNull && readOnly
	 */
	public Long vmVcpuTotal;

	/**
	 * Number of physical CPU cores on the host.
	 *
	 * canBeNull && readOnly
	 */
	public Long cpuNum;

	/**
	 * Billing type of the host
	 *
	 * canBeNull && readOnly
	 */
	public OvhBillingTypeEnum billingType;

	/**
	 * Cluster of the host
	 *
	 * canBeNull && readOnly
	 */
	public String clusterName;

	/**
	 * Name of the host (IP address)
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The speed of the CPU cores. This is an average value if there are multiple speeds. in Mhz
	 *
	 * canBeNull && readOnly
	 */
	public Long cpuMaxCore;

	/**
	 * Id of the parent host (if any)
	 *
	 * canBeNull && readOnly
	 */
	public Long parentHostId;

	/**
	 * State of the host
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Number of Virtual Machine on the host
	 *
	 * canBeNull && readOnly
	 */
	public Long vmTotal;

	/**
	 * Total RAM quantity
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> ram;
}
