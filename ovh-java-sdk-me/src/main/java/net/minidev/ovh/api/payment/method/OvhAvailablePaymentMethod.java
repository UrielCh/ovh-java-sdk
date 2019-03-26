package net.minidev.ovh.api.payment.method;

/**
 * Available payment methods
 */
public class OvhAvailablePaymentMethod {
	/**
	 * Payment method type is registerable ?
	 *
	 * canBeNull
	 */
	public Boolean registerable;

	/**
	 * Payment method type icon
	 *
	 * canBeNull
	 */
	public OvhIcon icon;

	/**
	 * Payment method type is possible to pay in oneshot mode ?
	 *
	 * canBeNull
	 */
	public Boolean oneshot;

	/**
	 * Payment method type
	 *
	 * canBeNull
	 */
	public String paymentType;
}
