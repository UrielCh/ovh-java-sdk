package net.minidev.ovh.api.telephony;

/**
 * Easy/Mini PABX agent
 */
public class OvhEasyMiniPabxHuntingAgent {
	/**
	 * True if the agent is logged
	 *
	 * canBeNull && readOnly
	 */
	public Boolean logged;

	/**
	 * The maxium ringing time
	 *
	 * canBeNull && readOnly
	 */
	public Long noReplyTimer;

	/**
	 * The position in the hunting
	 *
	 * canBeNull && readOnly
	 */
	public Long position;

	/**
	 * The phone number of the agent
	 *
	 * canBeNull && readOnly
	 */
	public String agentNumber;
}
