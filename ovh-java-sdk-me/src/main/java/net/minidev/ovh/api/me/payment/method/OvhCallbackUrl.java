package net.minidev.ovh.api.me.payment.method;

/**
 * Callback URL's to register a new payment method
 */
public class OvhCallbackUrl {
	/**
	 * URL when customer cancels the action
	 *
	 * canBeNull && readOnly
	 */
	public String cancel;

	/**
	 * URL when registration failed
	 *
	 * canBeNull && readOnly
	 */
	public String failure;

	/**
	 * URL when payment method registration success
	 *
	 * canBeNull && readOnly
	 */
	public String success;

	/**
	 * URL when payment method is in validation
	 *
	 * canBeNull && readOnly
	 */
	public String pending;

	/**
	 * URL when registration encounters an error
	 *
	 * canBeNull && readOnly
	 */
	public String error;
}
