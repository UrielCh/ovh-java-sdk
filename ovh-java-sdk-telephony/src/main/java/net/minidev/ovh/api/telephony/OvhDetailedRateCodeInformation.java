package net.minidev.ovh.api.telephony;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Detailed informations related to this number
 */
public class OvhDetailedRateCodeInformation {
	/**
	 * Repayment per minute
	 *
	 * canBeNull
	 */
	public OvhPrice repaymentPricePerMinuteWithoutTax;

	/**
	 * Price in minute
	 *
	 * canBeNull
	 */
	public OvhPrice pricePerMinuteWithoutTax;

	/**
	 * Effective datetime
	 *
	 * canBeNull
	 */
	public Date effectiveDatetime;

	/**
	 * Cancelable datetime deadline for the new scheduled rateCode
	 *
	 * canBeNull
	 */
	public Date cancelLimitDatetime;

	/**
	 * Price per call
	 *
	 * canBeNull
	 */
	public OvhPrice pricePerCallWithoutTax;

	/**
	 * Repayment per call
	 *
	 * canBeNull
	 */
	public OvhPrice repaymentPricePerCallWithoutTax;

	/**
	 * Scheduled rate code
	 *
	 * canBeNull
	 */
	public String rateCode;

	/**
	 * Fees concerning rateCode update
	 *
	 * canBeNull
	 */
	public OvhPrice updateRateCodePriceWithoutTax;
}
