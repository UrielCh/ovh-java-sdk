package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Live statistics of the queue
 */
public class OvhOvhPabxHuntingQueueLiveStatistics {
	/**
	 * Total of calls answered
	 *
	 * canBeNull && readOnly
	 */
	public Long callsAnswered;

	/**
	 * Total call duration in seconds
	 *
	 * canBeNull && readOnly
	 */
	public Long totalCallDuration;

	/**
	 * Total of calls lost
	 *
	 * canBeNull && readOnly
	 */
	public Long callsLost;

	/**
	 * Total of calls
	 *
	 * canBeNull && readOnly
	 */
	public Long callsTotal;

	/**
	 * Last reset datetime of queue's statistics
	 *
	 * canBeNull && readOnly
	 */
	public Date lastReset;

	/**
	 * Total waiting duration in seconds
	 *
	 * canBeNull && readOnly
	 */
	public Long totalWaitingDuration;
}
