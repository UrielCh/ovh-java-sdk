package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Informations related to the rate code
 */
public class OvhRateCodeInformation {
	/**
	 * The Rsva rate code
	 *
	 * canBeNull
	 */
	public String code;

	/**
	 * Price per minute
	 *
	 * canBeNull
	 */
	public OvhPrice pricePerMinuteWithoutTax;

	/**
	 * Price per call
	 *
	 * canBeNull
	 */
	public OvhPrice pricePerCallWithoutTax;
}
