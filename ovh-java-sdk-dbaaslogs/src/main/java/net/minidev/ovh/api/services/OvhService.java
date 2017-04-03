package net.minidev.ovh.api.services;

import java.util.Date;
import net.minidev.ovh.api.service.OvhRenewType;
import net.minidev.ovh.api.service.OvhRenewalTypeEnum;
import net.minidev.ovh.api.service.OvhStateEnum;

/**
 * Details about a Service
 */
public class OvhService {
	/**
	 * canBeNull && readOnly
	 */
	public Date engagedUpTo;

	/**
	 * canBeNull && readOnly
	 */
	public String contactBilling;

	/**
	 * canBeNull && readOnly
	 */
	public String contactAdmin;

	/**
	 * All the possible renew period of your service in month
	 *
	 * canBeNull && readOnly
	 */
	public Long[] possibleRenewPeriod;

	/**
	 * canBeNull && readOnly
	 */
	public OvhRenewalTypeEnum renewalType;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public String contactTech;

	/**
	 * canBeNull && readOnly
	 */
	public Date expiration;

	/**
	 * Way of handling the renew
	 *
	 * canBeNull && readOnly
	 */
	public OvhRenewType renew;

	/**
	 * canBeNull && readOnly
	 */
	public Date creation;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStateEnum status;

	/**
	 * Indicates that the service can be set up to be deleted at expiration
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canDeleteAtExpiration;
}
