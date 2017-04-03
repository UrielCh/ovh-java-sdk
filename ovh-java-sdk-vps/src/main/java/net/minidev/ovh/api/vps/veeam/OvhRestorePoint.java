package net.minidev.ovh.api.vps.veeam;

import java.util.Date;

/**
 * Informations about a VPS Veeam restore points
 */
public class OvhRestorePoint {
	/**
	 * The restore point's creation time
	 *
	 * canBeNull && readOnly
	 */
	public Date creationTime;

	/**
	 * The restore point's id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
