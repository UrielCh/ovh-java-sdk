package net.minidev.ovh.api.hosting.windows;

import net.minidev.ovh.api.hosting.web.OvhOfferCapabilitiesEnum;
import net.minidev.ovh.api.hosting.web.OvhOperatingSystemEnum;
import net.minidev.ovh.api.hosting.web.OvhResourceEnum;

/**
 * Windows web Hosting
 */
public class OvhService {
	/**
	 * Hosting offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferCapabilitiesEnum offer;

	/**
	 * Service name
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Hosting's OS
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperatingSystemEnum operatingSystem;

	/**
	 * Hosting resource type
	 *
	 * canBeNull && readOnly
	 */
	public OvhResourceEnum resourceType;
}
