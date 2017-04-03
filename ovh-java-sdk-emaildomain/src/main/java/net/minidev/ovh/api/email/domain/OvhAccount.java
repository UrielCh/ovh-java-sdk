package net.minidev.ovh.api.email.domain;

/**
 * Account List
 */
public class OvhAccount {
	/**
	 * Size of your account in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * Name of account
	 *
	 * canBeNull && readOnly
	 */
	public String accountName;

	/**
	 * Name of domain
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * If true your account is blocked
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isBlocked;

	/**
	 * Account description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Email
	 *
	 * canBeNull && readOnly
	 */
	public String email;
}
