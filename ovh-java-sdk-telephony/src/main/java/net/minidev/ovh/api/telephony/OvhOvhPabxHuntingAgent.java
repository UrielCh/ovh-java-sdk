package net.minidev.ovh.api.telephony;

/**
 * Calls agent
 */
public class OvhOvhPabxHuntingAgent {
	/**
	 * The id of the current break status of the agent
	 *
	 * canBeNull && readOnly
	 */
	public Long breakStatus;

	/**
	 * The number of the agent
	 *
	 * canBeNull && readOnly
	 */
	public String number;

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
	 * The agent's description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * The agent's type
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxHuntingAgentTypeEnum type;

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
