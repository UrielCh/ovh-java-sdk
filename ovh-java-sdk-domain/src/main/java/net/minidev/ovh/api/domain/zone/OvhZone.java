package net.minidev.ovh.api.domain.zone;

import java.util.Date;

/**
 * Zone dns Management
 */
public class OvhZone {
	/**
	 * hasDnsAnycast flag of the DNS zone
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hasDnsAnycast;

	/**
	 * Is DNSSEC supported by this zone
	 *
	 * canBeNull && readOnly
	 */
	public Boolean dnssecSupported;

	/**
	 * Last update date of the DNS zone
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Name servers that host the DNS zone
	 *
	 * canBeNull && readOnly
	 */
	public String[] nameServers;
}
