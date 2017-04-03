package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Live statistics of the queue
 */
public class OvhOvhPabxHuntingAgentLiveStatus {
	/**
	 * The number of calls this agent took on the current day
	 *
	 * canBeNull && readOnly
	 */
	public Long answeredCalls;

	/**
	 * The total duration in seconds of the calls this agent took on the current day
	 *
	 * canBeNull && readOnly
	 */
	public Long totalCallDuration;

	/**
	 * Last status change date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastStatusChange;

	/**
	 * Current status of the agent
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxHuntingLiveAgentStatusEnum status;
}
