package net.minidev.ovh.api.ip;

/**
 * IP migration to OVH
 */
public class OvhIpMigrationToken {
	/**
	 * destination customer ID
	 *
	 * canBeNull && readOnly
	 */
	public String customerId;

	/**
	 * migration token
	 *
	 * canBeNull && readOnly
	 */
	public String token;
}
