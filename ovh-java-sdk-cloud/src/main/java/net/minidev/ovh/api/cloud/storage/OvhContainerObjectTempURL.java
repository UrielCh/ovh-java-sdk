package net.minidev.ovh.api.cloud.storage;

import java.util.Date;

/**
 * ContainerObjectTempURL
 */
public class OvhContainerObjectTempURL {
	/**
	 * Temporary URL to get object
	 *
	 * canBeNull && readOnly
	 */
	public String getURL;

	/**
	 * Temporary URL expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
