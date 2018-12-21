package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Automatic Call made by Call Generator on this line
 */
public class OvhCallsGenerated {
	/**
	 * Generated call identifier
	 *
	 * canBeNull && readOnly
	 */
	public String identifier;

	/**
	 * call duration on seconds
	 *
	 * canBeNull && readOnly
	 */
	public Long callDuration;

	/**
	 * original call uuid if it's a transfer
	 *
	 * canBeNull && readOnly
	 */
	public String transferFrom;

	/**
	 * DTMF received during the call separate by commas
	 *
	 * canBeNull && readOnly
	 */
	public String dtmf;

	/**
	 * number called
	 *
	 * canBeNull && readOnly
	 */
	public String callee;

	/**
	 * billingNumber (service used)
	 *
	 * canBeNull && readOnly
	 */
	public String billingNumber;

	/**
	 * creation date of the call
	 *
	 * canBeNull && readOnly
	 */
	public Date callCreatedDatetime;

	/**
	 * unique call id
	 *
	 * canBeNull && readOnly
	 */
	public String uuid;

	/**
	 * hangup cause
	 *
	 * canBeNull && readOnly
	 */
	public OvhCallsGeneratorHangupCauseEnum hangupCause;

	/**
	 * answer date
	 *
	 * canBeNull && readOnly
	 */
	public Date answerDatetime;

	/**
	 * number where the call come from
	 *
	 * canBeNull && readOnly
	 */
	public String caller;

	/**
	 * Application and dialplan running for call
	 *
	 * canBeNull && readOnly
	 */
	public String application;

	/**
	 * hangup date
	 *
	 * canBeNull && readOnly
	 */
	public Date hangupDatetime;

	/**
	 * end status of application
	 *
	 * canBeNull && readOnly
	 */
	public String applicationResult;
}
