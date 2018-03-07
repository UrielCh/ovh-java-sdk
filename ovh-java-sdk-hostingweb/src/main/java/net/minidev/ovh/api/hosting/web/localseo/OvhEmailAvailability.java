package net.minidev.ovh.api.hosting.web.localseo;

import net.minidev.ovh.api.hosting.web.localseo.account.OvhEmailAvailabilityEnum;

/**
 * Struct describing the availability of an email address for a local SEO order
 */
public class OvhEmailAvailability {
	/**
	 * Availability of the email address
	 *
	 * canBeNull
	 */
	public OvhEmailAvailabilityEnum availability;

	/**
	 * Hosting on which the email address is used
	 *
	 * canBeNull
	 */
	public String serviceName;
}
