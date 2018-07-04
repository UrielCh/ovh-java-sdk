package net.minidev.ovh.api.order.catalog.pcc;

import net.minidev.ovh.api.nichandle.OvhCountryEnum;

/**
 * Describes a Private Cloud Datacenter
 */
public class OvhDatacenter {
	/**
	 * Describes if resources can be ordered on a Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public Boolean orderableResources;

	/**
	 * City Name of a Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public String cityName;

	/**
	 * Describes if a Private Cloud can be ordered on a Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public Boolean orderable;

	/**
	 * Country Code of a Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum countryCode;

	/**
	 * City Code of a Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public String cityCode;

	/**
	 * List of filers add in case of a No Pack order
	 *
	 * canBeNull && readOnly
	 */
	public String[] storagesNoPack;

	/**
	 * Describes if options can be ordered on a Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public Boolean orderableOptions;

	/**
	 * Zone Code of a datacenter
	 *
	 * canBeNull && readOnly
	 */
	public String zoneFullName;

	/**
	 * Describes Private Cloud Hypervisors
	 *
	 * canBeNull && readOnly
	 */
	public OvhHypervisor[] hypervisors;

	/**
	 * Name of the default hypervisor of a Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public String defaultHypervisor;

	/**
	 * Zone Name of a datacenter
	 *
	 * canBeNull && readOnly
	 */
	public String zoneName;

	/**
	 * Main plan code to use for a Datacenter
	 *
	 * canBeNull && readOnly
	 */
	public String mainPlan;
}
