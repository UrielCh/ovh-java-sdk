package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing informations about this dedicated server
 */
public class OvhHardwareSpecifications {
	/**
	 * Server form factor
	 *
	 * canBeNull
	 */
	public OvhFormFactorEnum formFactor;

	/**
	 * Capacity of the USB keys installed on your server, if any
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long>[] usbKeys;

	/**
	 * server motherboard
	 *
	 * canBeNull
	 */
	public String motherboard;

	/**
	 * commercial name of this server
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Default hardware raid type configured on this server
	 *
	 * canBeNull
	 */
	public OvhHardwareSpecificationsRaidHardEnum defaultHardwareRaidType;

	/**
	 * number of cores per processor
	 *
	 * canBeNull
	 */
	public Long coresPerProcessor;

	/**
	 * Server boot mode
	 *
	 * canBeNull
	 */
	public OvhBootModeEnum bootMode;

	/**
	 * number of threads per processor
	 *
	 * canBeNull
	 */
	public Long threadsPerProcessor;

	/**
	 * ram capacity
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> memorySize;

	/**
	 * Default hardware raid size for this server
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> defaultHardwareRaidSize;

	/**
	 * number of processors in this dedicated server
	 *
	 * canBeNull
	 */
	public Long numberOfProcessors;

	/**
	 * details about the groups of disks in the server
	 *
	 * canBeNull
	 */
	public OvhHardwareSpecificationsDisk[] diskGroups;

	/**
	 * processor name
	 *
	 * canBeNull
	 */
	public String processorName;

	/**
	 * processor architecture bit
	 *
	 * canBeNull
	 */
	public OvhCpuFamilyEnum processorArchitecture;

	/**
	 * details about the server's expansion cards
	 *
	 * canBeNull
	 */
	public OvhHardwareSpecificationsExpansionCard[] expansionCards;
}
