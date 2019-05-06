package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Billing Account
 */
public class OvhBillingAccount {
	/**
	 * Current outplan
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice currentOutplan;

	/**
	 * Allowed outplan
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice allowedOutplan;

	/**
	 * Is the billing account trusted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean trusted;

	/**
	 * Override number display for calls between services of your billing account
	 *
	 * canBeNull && readOnly
	 */
	public Boolean overrideDisplayedNumber;

	/**
	 * Description of the billing account
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Security deposit amount
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice securityDeposit;

	/**
	 * Hide called numbers in end-of-month call details CSV
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hiddenExternalNumber;

	/**
	 * Name of the billing account
	 *
	 * canBeNull && readOnly
	 */
	public String billingAccount;

	/**
	 * Allowed threshold credit
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice creditThreshold;

	/**
	 * Current status of billing account
	 *
	 * canBeNull && readOnly
	 */
	public OvhBillingAccountStatusEnum status;
}
