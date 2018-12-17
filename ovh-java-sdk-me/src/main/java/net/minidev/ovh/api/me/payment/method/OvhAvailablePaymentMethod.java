package net.minidev.ovh.api.me.payment.method;

/**
 * Available payment method object
 */
public class OvhAvailablePaymentMethod {
	/**
	 * Payment method type is registerable ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean registerable;

	/**
	 * Payment method type icon
	 *
	 * canBeNull && readOnly
	 */
	public OvhIcon icon;

	/**
	 * Payment method type is possible to pay in oneshot mode ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean oneshot;

	/**
	 * Payment method type
	 *
	 * canBeNull && readOnly
	 */
	public String paymentType;
}
