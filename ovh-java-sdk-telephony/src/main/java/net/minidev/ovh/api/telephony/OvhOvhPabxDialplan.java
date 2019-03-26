package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Dialplan
 */
public class OvhOvhPabxDialplan {
	/**
	 * Reject (hangup) anonymous calls
	 *
	 * canBeNull && readOnly
	 */
	public Boolean anonymousRejection;

	/**
	 * The timeout (in seconds) when bridging calls
	 *
	 * canBeNull && readOnly
	 */
	public Long transferTimeout;

	/**
	 * The presented number when bridging calls
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxDialplanNumberPresentationEnum showCallerNumber;

	/**
	 * canBeNull && readOnly
	 */
	public Long dialplanId;

	/**
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * The dialplan name
	 *
	 * canBeNull && readOnly
	 */
	public String name;
}
