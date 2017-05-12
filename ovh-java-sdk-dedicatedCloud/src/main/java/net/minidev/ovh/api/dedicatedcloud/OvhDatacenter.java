package net.minidev.ovh.api.dedicatedcloud;

/**
 * Private Cloud Datacenter
 */
public class OvhDatacenter {
	/**
	 * Name of the associated Horizon View service if the VDI option is enabled
	 *
	 * canBeNull && readOnly
	 */
	public String horizonViewName;

	/**
	 * The commercial range associated to this Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public String commercialRangeName;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public Long datacenterId;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Check if this datacenter is removable (Need to be Empty)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isRemovable;

	/**
	 * Os version installed on your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * The commercial name of this Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public OvhCommercialNameEnum commercialName;
}
