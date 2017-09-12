package net.minidev.ovh.api.domain.zone;

import java.util.Date;

/**
 * Zone restore point
 */
public class OvhZoneRestorePoint {
	/**
	 * URL to get backup content
	 *
	 * canBeNull && readOnly
	 */
	public String zoneFileUrl;

	/**
	 * Date of backup creation
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
