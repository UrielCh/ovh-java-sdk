package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.right.OvhNetworkRoleEnum;

/**
 * The commercial ranges actually available in your Private Cloud
 */
public class OvhCommercialRange {
	/**
	 * The hypervisor versions compliant with this commercial Range
	 *
	 * canBeNull && readOnly
	 */
	public OvhHypervisorVersionEnum[] allowedHypervisorVersions;

	/**
	 * The name of this commercial range
	 *
	 * canBeNull && readOnly
	 */
	public String commercialRangeName;

	/**
	 * The name of the dedicated Cloud version associated to this commercial range
	 *
	 * canBeNull && readOnly
	 */
	public String dedicatedCloudVersion;

	/**
	 * The range of this Datacenter in this Private Cloud version
	 *
	 * canBeNull && readOnly
	 */
	public String range;

	/**
	 * The list of NetworkRoles allowed for one user in this commercial range
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkRoleEnum[] allowedNetworkRoles;
}
