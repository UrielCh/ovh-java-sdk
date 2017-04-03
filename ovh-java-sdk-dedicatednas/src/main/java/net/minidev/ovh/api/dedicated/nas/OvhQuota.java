package net.minidev.ovh.api.dedicated.nas;

/**
 * Partition Quota
 */
public class OvhQuota {
	/**
	 * the uid to set quota on
	 *
	 * canBeNull && readOnly
	 */
	public Long uid;

	/**
	 * the size to set in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long size;
}
