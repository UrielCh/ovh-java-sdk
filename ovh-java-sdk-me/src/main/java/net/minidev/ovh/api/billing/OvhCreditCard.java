package net.minidev.ovh.api.billing;

import java.util.Date;

/**
 * Credit card informations
 */
public class OvhCreditCard {
	/**
	 * canBeNull && readOnly
	 */
	public String number;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean defaultPaymentMean;

	/**
	 * True if this credit card has been registered with a successful 3DSecure challenge
	 *
	 * canBeNull && readOnly
	 */
	public Boolean threeDsValidated;

	/**
	 * Custom description of this account
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public OvhCreditCardStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
