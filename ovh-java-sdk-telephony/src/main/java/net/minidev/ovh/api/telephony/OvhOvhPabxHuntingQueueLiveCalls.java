package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Live statistics of the queue
 */
public class OvhOvhPabxHuntingQueueLiveCalls {
	/**
	 * Name or number of the agent who answered the call
	 *
	 * canBeNull && readOnly
	 */
	public String agent;

	/**
	 * Phone number of the caller (or anonymous if unknown)
	 *
	 * canBeNull && readOnly
	 */
	public String callerIdNumber;

	/**
	 * Whether or not the call is on hold
	 *
	 * canBeNull && readOnly
	 */
	public Boolean onHold;

	/**
	 * Answer date of the call
	 *
	 * canBeNull && readOnly
	 */
	public Date answered;

	/**
	 * End date of the call
	 *
	 * canBeNull && readOnly
	 */
	public Date end;

	/**
	 * Name of the caller (or anonymous if unknown)
	 *
	 * canBeNull && readOnly
	 */
	public String callerIdName;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Current state of the call
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxHuntingLiveCallsStateEnum state;

	/**
	 * Begin date of the call
	 *
	 * canBeNull && readOnly
	 */
	public Date begin;

	/**
	 * Name of the queue of the call
	 *
	 * canBeNull && readOnly
	 */
	public String queue;

	/**
	 * Phone number called (in case of an outgoing call)
	 *
	 * canBeNull && readOnly
	 */
	public String destinationNumber;
}
