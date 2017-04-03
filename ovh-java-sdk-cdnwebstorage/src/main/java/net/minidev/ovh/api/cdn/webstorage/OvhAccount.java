package net.minidev.ovh.api.cdn.webstorage;

/**
 * Static CDN
 */
public class OvhAccount {
	/**
	 * canBeNull && readOnly
	 */
	public String server;

	/**
	 * value in Bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long storageUsage;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * value in Bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long storageLimit;
}
