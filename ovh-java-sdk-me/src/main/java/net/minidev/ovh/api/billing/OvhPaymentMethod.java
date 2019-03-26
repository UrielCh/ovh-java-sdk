package net.minidev.ovh.api.billing;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import net.minidev.ovh.api.billing.paymentmethod.OvhPaymentSubTypeEnum;
import net.minidev.ovh.api.billing.paymentmethod.OvhPaymentTypeEnum;
import net.minidev.ovh.api.billing.paymentmethod.OvhStatusEnum;

/**
 * Available payment methods
 */
public class OvhPaymentMethod {
	/**
	 * Public payment method label
	 *
	 * canBeNull
	 */
	public String publicLabel;

	/**
	 * Is this payment method set as the default one
	 *
	 * canBeNull
	 */
	@JsonProperty("default")
	public Boolean _default;

	/**
	 * Payment sub type
	 *
	 * canBeNull
	 */
	public OvhPaymentSubTypeEnum paymentSubType;

	/**
	 * Customer personalized description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Payment method id
	 *
	 * canBeNull
	 */
	public Long id;

	/**
	 * Creation date of the payment method
	 *
	 * canBeNull
	 */
	public Date creationDate;

	/**
	 * Billing contact ID
	 *
	 * canBeNull
	 */
	public Long billingContactId;

	/**
	 * Payment method status enum
	 *
	 * canBeNull
	 */
	public OvhStatusEnum status;

	/**
	 * Payment type
	 *
	 * canBeNull
	 */
	public OvhPaymentTypeEnum paymentType;
}
