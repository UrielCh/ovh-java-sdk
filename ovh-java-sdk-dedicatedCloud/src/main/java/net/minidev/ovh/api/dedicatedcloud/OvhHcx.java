package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.option.OvhStateEnum;

/**
 * Private Cloud VMware Hybrid Cloud Extension option
 */
public class OvhHcx {
	/**
	 * Build of the VMware Hybrid Cloud Extension
	 *
	 * canBeNull && readOnly
	 */
	public String build;

	/**
	 * State of the option
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Version of the VMware Hybrid Cloud Extension
	 *
	 * canBeNull && readOnly
	 */
	public String version;
}
