package net.minidev.ovh.api.dedicatedcloud;

import java.util.Date;

/**
 * Hypervisors actually available in Private Cloud
 */
public class OvhOs {
	/**
	 * Last modification of hypervisor
	 *
	 * canBeNull && readOnly
	 */
	public Date lastModificationDate;

	/**
	 * Full name of hypervisor
	 *
	 * canBeNull && readOnly
	 */
	public String fullName;

	/**
	 * Short name of hypervisor
	 *
	 * canBeNull && readOnly
	 */
	public String shortName;
}
