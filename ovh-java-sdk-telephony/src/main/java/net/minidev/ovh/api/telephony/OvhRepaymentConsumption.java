package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Call which are repayable
 */
public class OvhRepaymentConsumption {
	/**
	 * Duration of the call
	 *
	 * canBeNull && readOnly
	 */
	public Long duration;

	/**
	 * Called number of the call
	 *
	 * canBeNull && readOnly
	 */
	public String called;

	/**
	 * canBeNull && readOnly
	 */
	public Long consumptionId;

	/**
	 * canBeNull && readOnly
	 */
	public String dialed;

	/**
	 * Price repayed with the call
	 *
	 * canBeNull && readOnly
	 */
	public Double price;

	/**
	 * Calling number of the call
	 *
	 * canBeNull && readOnly
	 */
	public String calling;

	/**
	 * the Datetime of the start of the call
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;
}
