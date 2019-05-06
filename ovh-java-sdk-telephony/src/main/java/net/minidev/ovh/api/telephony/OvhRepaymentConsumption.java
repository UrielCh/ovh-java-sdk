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
	 * Price repayed with the call
	 *
	 * canBeNull && readOnly
	 */
	public Double price;

	/**
	 * canBeNull && readOnly
	 */
	public String dialed;

	/**
	 * Calling number of the call
	 *
	 * canBeNull && readOnly
	 */
	public String calling;

	/**
	 * Is the call repayable right now
	 *
	 * canBeNull && readOnly
	 */
	public Boolean repayable;

	/**
	 * the Datetime of the start of the call
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;

	/**
	 * Calling number's operator
	 *
	 * canBeNull && readOnly
	 */
	public String operator;
}
