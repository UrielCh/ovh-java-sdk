package net.minidev.ovh.api.me.payment.method.register;

/**
 * Register validation payload result
 */
public class OvhValidationResult {
	/**
	 * Register new payment method ID
	 *
	 * canBeNull && readOnly
	 */
	public Long paymentMethodId;

	/**
	 * Register validation type
	 *
	 * canBeNull && readOnly
	 */
	public OvhValidationType validationType;

	/**
	 * Register validation URL
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
