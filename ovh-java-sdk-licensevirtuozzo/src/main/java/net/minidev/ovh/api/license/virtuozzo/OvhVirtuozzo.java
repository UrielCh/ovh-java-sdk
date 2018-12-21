package net.minidev.ovh.api.license.virtuozzo;

import java.util.Date;
import net.minidev.ovh.api.license.OvhStateEnum;
import net.minidev.ovh.api.license.OvhVirtuozzoContainerNumberEnum;
import net.minidev.ovh.api.license.OvhVirtuozzoVersionEnum;

/**
 * Your Virtuozzo license
 */
public class OvhVirtuozzo {
	/**
	 * Shall we delete this on expiration ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteAtExpiration;

	/**
	 * The amount of containers this license can manage
	 *
	 * canBeNull && readOnly
	 */
	public OvhVirtuozzoContainerNumberEnum containerNumber;

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
	 * This license product key
	 *
	 * canBeNull && readOnly
	 */
	public String productKey;

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
	public OvhVirtuozzoVersionEnum version;

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
	 * This license state
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum status;
}
