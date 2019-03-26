package net.minidev.ovh.api.license.plesk;

import java.util.Date;
import net.minidev.ovh.api.license.OvhDomainNumberEnum;
import net.minidev.ovh.api.license.OvhPleskVersionEnum;
import net.minidev.ovh.api.license.OvhStateEnum;

/**
 * Your Plesk license
 */
public class OvhPlesk {
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
	 * The amount of domain this license can manage
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainNumberEnum domainNumber;

	/**
	 * The license id on license provider side
	 *
	 * canBeNull && readOnly
	 */
	public String licenseId;

	/**
	 * This license product key
	 *
	 * canBeNull && readOnly
	 */
	public String productKey;

	/**
	 * This license version
	 *
	 * canBeNull && readOnly
	 */
	public OvhPleskVersionEnum version;

	/**
	 * This license Information key
	 *
	 * canBeNull && readOnly
	 */
	public String informationKey;

	/**
	 * This license creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creation;

	/**
	 * This license key
	 *
	 * canBeNull && readOnly
	 */
	public String key;

	/**
	 * This license state
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum status;
}
