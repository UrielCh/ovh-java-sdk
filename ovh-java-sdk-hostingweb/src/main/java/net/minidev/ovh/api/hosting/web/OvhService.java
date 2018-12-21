package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Web Hosting
 */
public class OvhService {
	/**
	 * Traffic quota allowed ( null = unlimited )
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> trafficQuotaSize;

	/**
	 * Cluster name
	 *
	 * canBeNull && readOnly
	 */
	public String cluster;

	/**
	 * Has a HostedSSL service linked on the hosting
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hasHostedSsl;

	/**
	 * Traffic quota used
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> trafficQuotaUsed;

	/**
	 * Set the name displayed in ManagerV6 for your hosting (max 50 chars)
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * The recommended ip for your hosting ( depends on hosting's linked services, e.g CDN or hostedSSL )
	 *
	 * canBeNull && readOnly
	 */
	public String hostingIp;

	/**
	 * List of updates on your hosting
	 *
	 * canBeNull && readOnly
	 */
	public String[] updates;

	/**
	 * Hosting's OS
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperatingSystemEnum operatingSystem;

	/**
	 * Hosting's main login
	 *
	 * canBeNull && readOnly
	 */
	public String primaryLogin;

	/**
	 * Hosting offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferCapabilitiesEnum offer;

	/**
	 * Available clusterIp by countries
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountriesIp[] countriesIp;

	/**
	 * State of your hosting
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Datacenter where this account is located
	 *
	 * canBeNull && readOnly
	 */
	public OvhDatacenterEnum datacenter;

	/**
	 * Current boost offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferCapabilitiesEnum boostOffer;

	/**
	 * Service name
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * State of available php versions for this account
	 *
	 * canBeNull && readOnly
	 */
	public OvhPhpVersion[] phpVersions;

	/**
	 * Path of your home
	 *
	 * canBeNull && readOnly
	 */
	public String home;

	/**
	 * Use to link an external domain. ( This token has to be insert into a TXT field on your dns zone with ovhcontrol subdomain )
	 *
	 * canBeNull && readOnly
	 */
	public String token;

	/**
	 * This direct ipv6 to your cluster ( usefull for application like api )
	 *
	 * canBeNull && readOnly
	 */
	public String clusterIpv6;

	/**
	 * Available offers for boost option
	 *
	 * canBeNull && readOnly
	 */
	public OvhAvailableOfferStruct[] availableBoostOffer;

	/**
	 * /hosting/web/{serviceName}/ovhConfig is stored in cache. This date is the last refresh of this data
	 *
	 * canBeNull && readOnly
	 */
	public Date lastOvhConfigScan;

	/**
	 * Space used
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> quotaUsed;

	/**
	 * Has a CDN service linked on the hosting
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hasCdn;

	/**
	 * Filer name
	 *
	 * canBeNull && readOnly
	 */
	public String filer;

	/**
	 * If your offer is old, return a recommended offer to migrate on
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferEnum recommendedOffer;

	/**
	 * The recommended ipv6 for your hosting ( depends on hosting's linked services, e.g CDN or hostedSSL )
	 *
	 * canBeNull && readOnly
	 */
	public String hostingIpv6;

	/**
	 * Space allowed
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> quotaSize;

	/**
	 * URLs to use to manage your webhosting
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceAccess serviceManagementAccess;

	/**
	 * This direct ip to your cluster ( usefull for application like api )
	 *
	 * canBeNull && readOnly
	 */
	public String clusterIp;

	/**
	 * Hosting resource type
	 *
	 * canBeNull && readOnly
	 */
	public OvhResourceEnum resourceType;
}
