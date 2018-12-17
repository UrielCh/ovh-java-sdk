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
	 * Snapshot name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Volume source id
	 *
	 * canBeNull && readOnly
	 */
	public String volumeId;

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
	 * Order plan code
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * Snapshot status
	 *
	 * canBeNull && readOnly
	 */
	public OvhSnapshotStatusEnum status;
}
