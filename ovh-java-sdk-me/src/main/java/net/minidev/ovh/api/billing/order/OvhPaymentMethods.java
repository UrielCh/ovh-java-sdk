package net.minidev.ovh.api.billing.order;

import net.minidev.ovh.api.payment.method.OvhAvailablePaymentMethod;

/**
 * Payment methods
 */
public class OvhPaymentMethods {
	/**
	 * Payment method available on this order
	 *
	 * canBeNull
	 */
	public OvhAvailablePaymentMethod[] available;

	/**
	 * IDs of registered payment method usable on this order
	 *
	 * canBeNull
	 */
	public Long[] registered;
}
