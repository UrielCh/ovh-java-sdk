package net.minidev.ovh.api.dedicatedcloud.disasterrecovery;

import net.minidev.ovh.api.dedicatedcloud.OvhStateEnum;

/**
 * Information on the remote datacenter linked to the local one
 */
public class OvhRemoteSiteDetails {
	/**
	 * Zvm mode configured
	 *
	 * canBeNull
	 */
	public OvhSiteRoleEnum role;

	/**
	 * Datacenter name (if hosted by OVH)
	 *
	 * canBeNull
	 */
	public String datacenterName;

	/**
	 * Datacenter Id (if hosted by OVH)
	 *
	 * canBeNull
	 */
	public Long datacenterId;

	/**
	 * State of the remote Zvm
	 *
	 * canBeNull
	 */
	public OvhStateEnum state;

	/**
	 * Service name (if hosted by OVH)
	 *
	 * canBeNull
	 */
	public String serviceName;

	/**
	 * Installed version of Zerto
	 *
	 * canBeNull
	 */
	public String zertoVersion;

	/**
	 * Type of hosting for the remote datacenter
	 *
	 * canBeNull
	 */
	public OvhSiteTypeEnum type;
}
