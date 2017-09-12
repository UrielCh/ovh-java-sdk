package net.minidev.ovh.api.email.domain;

/**
 * Migration account
 */
public class OvhMigrationAccount {
	/**
	 * Destination account name
	 *
	 * canBeNull && readOnly
	 */
	public String destinationEmailAddress;

	/**
	 * Account maximum size
	 *
	 * canBeNull && readOnly
	 */
	public Long quota;
}
