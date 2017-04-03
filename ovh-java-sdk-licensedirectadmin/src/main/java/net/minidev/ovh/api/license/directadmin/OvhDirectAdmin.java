package net.minidev.ovh.api.license.directadmin;

import java.util.Date;
import net.minidev.ovh.api.license.OvhDirectAdminOsEnum;
import net.minidev.ovh.api.license.OvhDirectAdminVersionEnum;
import net.minidev.ovh.api.license.OvhStateEnum;

/**
 * Your DirectAdmin license
 */
public class OvhDirectAdmin {
	/**
	 * Shall we delete this on expiration ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteAtExpiration;

	/**
	 * The client id on license provider side
	 *
	 * canBeNull && readOnly
	 */
	public Long clientId;

	/**
	 * This license operating system
	 *
	 * canBeNull && readOnly
	 */
	public OvhDirectAdminOsEnum os;

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
	public OvhDirectAdminVersionEnum version;

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
