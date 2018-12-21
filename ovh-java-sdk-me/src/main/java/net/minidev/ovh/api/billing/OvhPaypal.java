package net.minidev.ovh.api.billing;

import java.util.Date;

/**
 * Paypal account info
 */
public class OvhPaypal {
	/**
	 * canBeNull && readOnly
	 */
	public Boolean defaultPaymentMean;

	/**
	 * canBeNull && readOnly
	 */
	public String agreementId;

	/**
	 * Custom description of this account
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPaypalStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * canBeNull && readOnly
	 */
	public String email;
}
