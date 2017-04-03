package net.minidev.ovh.api.paas.database;

import net.minidev.ovh.api.paas.database.image.OvhCapabilities;
import net.minidev.ovh.api.paas.database.image.OvhStatus;
import net.minidev.ovh.api.paas.database.image.OvhType;

/**
 * Images
 */
public class OvhImage {
	/**
	 * Image name
	 *
	 * canBeNull && readOnly
	 */
	public String imageName;

	/**
	 * Image capabilities
	 *
	 * canBeNull && readOnly
	 */
	public OvhCapabilities[] capabilities;

	/**
	 * Image type
	 *
	 * canBeNull && readOnly
	 */
	public OvhType type;

	/**
	 * Image version
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * Image status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
