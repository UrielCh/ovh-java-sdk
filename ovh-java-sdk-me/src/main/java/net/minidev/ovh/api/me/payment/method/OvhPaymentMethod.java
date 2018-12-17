package net.minidev.ovh.api.me.payment.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import net.minidev.ovh.api.me.payment.method.paymentmethod.OvhStatus;

/**
 * Payment method object
 */
public class OvhPaymentMethod {
	/**
	 * Payment method type icon
	 *
	 * canBeNull && readOnly
	 */
	public OvhIcon icon;

	/**
	 * Custom customer description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Payment method public label
	 *
	 * canBeNull && readOnly
	 */
	public String label;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Associated billing contact ID
	 *
	 * canBeNull && readOnly
	 */
	public Long billingContactId;

	/**
	 * Payment method type
	 *
	 * canBeNull && readOnly
	 */
	public String paymentType;

	/**
	 * Payment mean ID associated to this payment method
	 *
	 * canBeNull && readOnly
	 */
	public Long paymentMeanId;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("default")
	public Boolean _default;

	/**
	 * Payment method sub-type
	 *
	 * canBeNull && readOnly
	 */
	public String paymentSubType;

	/**
	 * Payment method ID
	 *
	 * canBeNull && readOnly
	 */
	public Long paymentMethodId;

	/**
	 * Last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;

	/**
	 * Payment method status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
