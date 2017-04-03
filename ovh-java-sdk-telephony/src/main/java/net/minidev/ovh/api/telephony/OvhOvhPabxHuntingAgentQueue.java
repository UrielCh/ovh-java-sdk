package net.minidev.ovh.api.telephony;

/**
 * Agent assigned to a queue
 */
public class OvhOvhPabxHuntingAgentQueue {
	/**
	 * canBeNull && readOnly
	 */
	public Long queueId;

	/**
	 * canBeNull && readOnly
	 */
	public Long agentId;

	/**
	 * The position in the queue
	 *
	 * canBeNull && readOnly
	 */
	public Long position;
}
