package net.minidev.ovh.api.billing;

import java.util.Date;

/**
 * Details about a payment
 */
public class OvhPayment {
	/**
	 * canBeNull && readOnly
	 */
	public String paymentIdentifier;

	/**
	 * canBeNull && readOnly
	 */
	public Date paymentDate;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPaymentMeanEnum paymentType;
}
