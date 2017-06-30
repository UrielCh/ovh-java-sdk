package net.minidev.ovh.api.billing;

/**
 * Available automatic payment means
 */
public class OvhAutomaticPaymentMean {
	/**
	 * Bank Account
	 *
	 * canBeNull
	 */
	public Boolean bankAccount;

	/**
	 * Credit Card
	 *
	 * canBeNull
	 */
	public Boolean creditCard;

	/**
	 * Paypal account
	 *
	 * canBeNull
	 */
	public Boolean paypal;

	/**
	 * Deferred invoice payment account for authorized customers
	 *
	 * canBeNull
	 */
	public Boolean deferredPaymentAccount;
}
