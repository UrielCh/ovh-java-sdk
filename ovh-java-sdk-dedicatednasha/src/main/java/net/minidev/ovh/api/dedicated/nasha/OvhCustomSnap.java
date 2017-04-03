package net.minidev.ovh.api.dedicated.nasha;

/**
 * Custom Snapshot
 */
public class OvhCustomSnap {
	/**
	 * name of the snapshot
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * date and time at which snapshot will be automatically destroyed
	 *
	 * canBeNull && readOnly
	 */
	public String expiration;
}
