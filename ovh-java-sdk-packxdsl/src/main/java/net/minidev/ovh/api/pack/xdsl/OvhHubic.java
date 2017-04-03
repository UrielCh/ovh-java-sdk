package net.minidev.ovh.api.pack.xdsl;

/**
 * Hubic service
 */
public class OvhHubic {
	/**
	 * Human readable size of the hubic account
	 *
	 * canBeNull && readOnly
	 */
	public String size;

	/**
	 * Size of the hubic account in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long bytes;

	/**
	 * Voucher to enter on HubiC website to activate the account
	 *
	 * canBeNull && readOnly
	 */
	public String voucher;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;
}
