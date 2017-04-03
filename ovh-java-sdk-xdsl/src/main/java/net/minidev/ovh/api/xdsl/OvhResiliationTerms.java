package net.minidev.ovh.api.xdsl;

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
	 * Minumum resiliationDate
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
	 * Date at which the access will be resiliated
	 *
	 * canBeNull
	 */
	public Date resiliationDate;
}
