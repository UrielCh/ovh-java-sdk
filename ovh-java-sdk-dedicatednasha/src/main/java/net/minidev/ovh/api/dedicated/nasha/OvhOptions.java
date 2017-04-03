package net.minidev.ovh.api.dedicated.nasha;

/**
 * Partition options
 */
public class OvhOptions {
	/**
	 * atime setting
	 *
	 * canBeNull && readOnly
	 */
	public String atime;

	/**
	 * ZFS recordsize
	 *
	 * canBeNull && readOnly
	 */
	public String recordsize;

	/**
	 * ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * sync setting
	 *
	 * canBeNull && readOnly
	 */
	public String sync;
}
