package net.minidev.ovh.api.distribution;

import net.minidev.ovh.api.distribution.image.OvhPackage;
import net.minidev.ovh.api.distribution.image.OvhProperties;
import net.minidev.ovh.api.distribution.image.OvhService;

/**
 * Information about installed package for a given image
 */
public class OvhImage {
	/**
	 * The service type name
	 *
	 * canBeNull && readOnly
	 */
	public OvhService service;

	/**
	 * The image name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Packages informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhPackage[] packages;

	/**
	 * Image properties
	 *
	 * canBeNull && readOnly
	 */
	public OvhProperties properties;
}
