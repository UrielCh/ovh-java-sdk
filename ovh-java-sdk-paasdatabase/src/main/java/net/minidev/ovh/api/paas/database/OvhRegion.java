package net.minidev.ovh.api.paas.database;

import net.minidev.ovh.api.paas.database.region.OvhStatus;

/**
 * Regions
 */
public class OvhRegion {
	/**
	 * Region name
	 *
	 * canBeNull && readOnly
	 */
	public String regionName;

	/**
	 * Region continent code
	 *
	 * canBeNull && readOnly
	 */
	public String continentCode;

	/**
	 * Region status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
