package net.minidev.ovh.api.license.worklight;

import java.util.Date;
import net.minidev.ovh.api.license.OvhStateEnum;
import net.minidev.ovh.api.license.OvhWorkLightVersionEnum;

/**
 * Your WorkLight license
 */
public class OvhWorkLight {
	/**
	 * Shall we delete this on expiration ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteAtExpiration;

	/**
	 * The internal name of your license
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * The ip on which this license is attached
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * The license id on license provider side
	 *
	 * canBeNull && readOnly
	 */
	public String licenseId;

	/**
	 * This license version
	 *
	 * canBeNull && readOnly
	 */
	public OvhWorkLightVersionEnum version;

	/**
	 * This license creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creation;

	/**
	 * This license state
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum status;
}
