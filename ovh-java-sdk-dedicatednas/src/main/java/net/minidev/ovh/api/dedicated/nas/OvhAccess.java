package net.minidev.ovh.api.dedicated.nas;

/**
 * Define Acl for partition
 */
public class OvhAccess {
	/**
	 * the id of the access
	 *
	 * canBeNull && readOnly
	 */
	public Long accessId;

	/**
	 * the ip in root on storage
	 *
	 * canBeNull && readOnly
	 */
	public String ip;
}
