package net.minidev.ovh.api.connectivity.eligibility;

import java.util.Date;

/**
 * Message
 */
public class OvhMessage {
	/**
	 * Code of the message
	 *
	 * canBeNull
	 */
	public OvhMessageCodeEnum code;

	/**
	 * Availability date of the offer (if code of non eligibility is COPPER_NOT_YET_AVAILABLE, FIBER_NOT_YET_AVAILABLE or PRODUCT_NOT_YET_AVAILABLE)
	 *
	 * canBeNull
	 */
	public Date availabilityDate;

	/**
	 * Message
	 *
	 * canBeNull
	 */
	public String message;
}
