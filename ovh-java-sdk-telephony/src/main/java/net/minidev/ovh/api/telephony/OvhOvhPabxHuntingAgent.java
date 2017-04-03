package net.minidev.ovh.api.telephony;

/**
 * Calls agent
 */
public class OvhOvhPabxHuntingAgent {
	/**
	 * The number of the agent
	 *
	 * canBeNull && readOnly
	 */
	public String number;

	/**
	 * The id of the current break status of the agent
	 *
	 * canBeNull && readOnly
	 */
	public Long breakStatus;

	/**
	 * canBeNull && readOnly
	 */
	public Long agentId;

	/**
	 * The wrap up time (in seconds) after the calls
	 *
	 * canBeNull && readOnly
	 */
	public Long wrapUpTime;

	/**
	 * The maximum of simultaneous calls that the agent will receive from the hunting
	 *
	 * canBeNull && readOnly
	 */
	public Long simultaneousLines;

	/**
	 * The waiting timeout (in seconds) before hangup an assigned called
	 *
	 * canBeNull && readOnly
	 */
	public Long timeout;

	/**
	 * The current status of the agent
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxHuntingAgentStatusEnum status;
}
