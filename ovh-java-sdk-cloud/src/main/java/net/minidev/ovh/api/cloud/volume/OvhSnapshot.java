package net.minidev.ovh.api.cloud.volume;

import java.util.Date;

/**
 * Snapshot
 */
public class OvhSnapshot {
	/**
	 * Snapshot size
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * Volume source id
	 *
	 * canBeNull && readOnly
	 */
	public String volumeId;

	/**
	 * Snapshot name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Snapshot description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Snapshot id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Snapshot region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Snapshot creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Snapshot status
	 *
	 * canBeNull && readOnly
	 */
	public OvhSnapshotStatusEnum status;
}
