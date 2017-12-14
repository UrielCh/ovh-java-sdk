package net.minidev.ovh.api.domain;

import java.util.Date;
/**
 * Domain name administration
 */
public class OvhDomain {
	/**
	 * Domain's offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferEnum offer;

	/**
	 * Transfer lock status
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainLockStatusEnum transferLockStatus;

	/**
	 * Contact Owner (you can edit it via /me/contact/<ID>)
	 *
	 * canBeNull && readOnly
	 */
	public String whoisOwner;

	/**
	 * Name servers type
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainNsTypeEnum nameServerType;

	/**
	 * Is whois obfuscation supported by this domain name's registry
	 *
	 * canBeNull && readOnly
	 */
	public Boolean owoSupported;

	/**
	 * Is DNSSEC implemented for this domain name's tld
	 *
	 * canBeNull && readOnly
	 */
	public Boolean dnssecSupported;

	/**
	 * Domain name
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Parent service
	 *
	 * canBeNull && readOnly
	 */
	public OvhParentService parentService;

	/**
	 * Does the registry support multi ip glue record
	 *
	 * canBeNull && readOnly
	 */
	public Boolean glueRecordMultiIpSupported;

	/**
	 * Does the registry support ipv6 glue record
	 *
	 * canBeNull && readOnly
	 */
	public Boolean glueRecordIpv6Supported;
}
