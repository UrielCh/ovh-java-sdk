package net.minidev.ovh.api.reseller;

import java.util.Date;

/**
 * Reseller snapshot
 */
public class OvhSnapshot {
	/**
	 * Snapshot name
	 *
	 * canBeNull && readOnly
	 */
	public String snashotName;

	/**
	 * Snapshot id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Snapshot creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Snapshot type
	 *
	 * canBeNull && readOnly
	 */
	public OvhSnapshotTypeEnum type;
}
