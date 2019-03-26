package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.backup.OvhBackup;

/**
 * Private Cloud Virtual Machine
 */
public class OvhVm {
	/**
	 * Name of the host hosting the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public String hostName;

	/**
	 * Backup associated to this Virtual Machine
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackup backup;

	/**
	 * Current version status of VMware Tools in the guest operating system.
	 *
	 * canBeNull && readOnly
	 */
	public String vmwareTools;

	/**
	 * Current CPU performance, in MHz.
	 *
	 * canBeNull && readOnly
	 */
	public Long cpuUsed;

	/**
	 * Id of the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public Long vmId;

	/**
	 * Memory size of the virtual machine, in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long memoryMax;

	/**
	 * Amount of time for a write operation from the virtual disk. In millisecond
	 *
	 * canBeNull && readOnly
	 */
	public Double writeLatency;

	/**
	 * List of the networks link to this virtual machine
	 *
	 * canBeNull && readOnly
	 */
	public OvhVmNetwork[] networks;

	/**
	 * Current memory utilization, in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long memoryUsed;

	/**
	 * Maximum CPU performance, in MHz.
	 *
	 * canBeNull && readOnly
	 */
	public Double cpuMax;

	/**
	 * Percentage of time that the virtual machine was ready, but could not get scheduled to run on the physical CPU. In percent
	 *
	 * canBeNull && readOnly
	 */
	public Double cpuReadyPercent;

	/**
	 * Number of snapshot of the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public Long snapshotNum;

	/**
	 * Power state of the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public OvhVirtualMachinePowerState powerState;

	/**
	 * The fault tolerance state of the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public OvhVirtualMachineFaultToleranceState stateFt;

	/**
	 * Cluster of the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public String clusterName;

	/**
	 * Number of write issued per second to the virtual disk. In millisecond
	 *
	 * canBeNull && readOnly
	 */
	public Double writePerSecond;

	/**
	 * Number of read issued per second to the virtual disk. In millisecond
	 *
	 * canBeNull && readOnly
	 */
	public Double readPerSecond;

	/**
	 * Amount of guest memory that is shared with other virtual machines, in Mb
	 *
	 * canBeNull && readOnly
	 */
	public String memoryTps;

	/**
	 * Rate of reading data from the virtual disk. In KB/s
	 *
	 * canBeNull && readOnly
	 */
	public Double readRate;

	/**
	 * Virtual machine cdroms devices
	 *
	 * canBeNull && readOnly
	 */
	public OvhVirtualMachineCdrom[] cdroms;

	/**
	 * moRef of the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public String moRef;

	/**
	 * Current version of VMware Tools
	 *
	 * canBeNull && readOnly
	 */
	public String vmwareToolsVersion;

	/**
	 * Number of processors in the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public Long cpuNum;

	/**
	 * Amount of time for a read operation from the virtual disk. In millisecond
	 *
	 * canBeNull && readOnly
	 */
	public Double readLatency;

	/**
	 * Rate of writing data from the virtual disk. In KB/s
	 *
	 * canBeNull && readOnly
	 */
	public Double writeRate;

	/**
	 * Time that the virtual machine was ready, but could not get scheduled to run on the physical CPU. In millisecond
	 *
	 * canBeNull && readOnly
	 */
	public Double cpuReady;

	/**
	 * The index of the current VM in instanceUuids array starting from 1, so 1 means that it is the primary VM.
	 *
	 * canBeNull && readOnly
	 */
	public String roleFt;

	/**
	 * Number of packets received.
	 *
	 * canBeNull && readOnly
	 */
	public Double netPacketRx;

	/**
	 * List of filers in use by the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public OvhVmFiler[] filers;

	/**
	 * Number of packets transmitted.
	 *
	 * canBeNull && readOnly
	 */
	public Double netPacketTx;

	/**
	 * Name of the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Folder of the virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public String folderName;

	/**
	 * Rate at which data is transmitted. In KB/s
	 *
	 * canBeNull && readOnly
	 */
	public Double netTx;

	/**
	 * Rate at which data is received. In KB/s
	 *
	 * canBeNull && readOnly
	 */
	public Double netRx;
}
