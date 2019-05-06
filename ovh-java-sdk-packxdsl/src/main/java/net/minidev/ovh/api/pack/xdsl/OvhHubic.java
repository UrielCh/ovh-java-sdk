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
	 * Voucher to enter on HubiC website to activate the account
	 *
	 * canBeNull && readOnly
	 */
	public String voucher;

	/**
	 * Size of the hubic account in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long bytes;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Indicate if the voucher is used or not
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isUsed;
}
