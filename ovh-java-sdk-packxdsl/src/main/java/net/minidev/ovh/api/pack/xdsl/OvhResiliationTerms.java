package net.minidev.ovh.api.pack.xdsl;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Show the resiliation terms
 */
public class OvhResiliationTerms {
	/**
	 * List of available resiliation reasons
	 *
	 * canBeNull
	 */
	public OvhResiliationReasonEnum[] resiliationReasons;

	/**
	 * Minimum date at which the pack can be resiliated
	 *
	 * canBeNull
	 */
	public Date minResiliationDate;

	/**
	 * Price due at resiliationDate
	 *
	 * canBeNull
	 */
	public OvhPrice due;

	/**
	 * Date until which the customer is engaged
	 *
	 * canBeNull
	 */
	public Date engageDate;

	/**
	 * Date at which the pack will be resiliated
	 *
	 * canBeNull
	 */
	public Date resiliationDate;
}
