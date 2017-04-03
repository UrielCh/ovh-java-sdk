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
	 * Override number display for calls between services of your billing account
	 *
	 * canBeNull && readOnly
	 */
	public Boolean overrideDisplayedNumber;

	/**
	 * Is the billing account trusted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean trusted;

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
