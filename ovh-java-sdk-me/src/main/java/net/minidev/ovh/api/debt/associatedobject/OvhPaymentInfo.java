package net.minidev.ovh.api.debt.associatedobject;

import net.minidev.ovh.api.billing.OvhPaymentMeanEnum;

/**
 * The payment infos linked to this debt entry
 */
public class OvhPaymentInfo {
	/**
	 * Public payment mean label
	 *
	 * canBeNull
	 */
	public String publicLabel;

	/**
	 * Optional customer description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Payment mean used for this debt operation
	 *
	 * canBeNull
	 */
	public OvhPaymentMeanEnum paymentType;
}
