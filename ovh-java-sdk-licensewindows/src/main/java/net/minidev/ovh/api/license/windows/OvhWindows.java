package net.minidev.ovh.api.license.windows;

import java.util.Date;
import net.minidev.ovh.api.license.OvhStateEnum;
import net.minidev.ovh.api.license.OvhWindowsOsVersionEnum;

/**
 * Your Windows license
 */
public class OvhWindows {
	/**
	 * Shall we delete this on expiration ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteAtExpiration;

	/**
	 * The ip on which this license is attached
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * The internal name of your license
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

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
	public OvhWindowsOsVersionEnum version;

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
