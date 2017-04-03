package net.minidev.ovh.api.agreements;

import java.util.Date;

/**
 * Contract of service
 */
public class OvhContract {
	/**
	 * Date the contract was created on
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * URL you can download the contract at
	 *
	 * canBeNull && readOnly
	 */
	public String pdf;

	/**
	 * Name of of the contract
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Is this contract currently active or not ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean active;

	/**
	 * Full text of the contract
	 *
	 * canBeNull && readOnly
	 */
	public String text;
}
