package net.minidev.ovh.api.telephony;

/**
 * EasyPabx Hunting
 */
public class OvhEasyPabxHunting {
	/**
	 * The voicemail used by the EasyPABX
	 *
	 * canBeNull && readOnly
	 */
	public String voicemail;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public OvhEasyMiniPabxHuntingPatternEnum pattern;

	/**
	 * True if the tone on closure is enabled
	 *
	 * canBeNull && readOnly
	 */
	public Boolean toneOnClosure;

	/**
	 * The maximum no-reply time before forwarding the call to the voicemail
	 *
	 * canBeNull && readOnly
	 */
	public Long noReplyTimer;

	/**
	 * True if the tone on hold is enabled
	 *
	 * canBeNull && readOnly
	 */
	public Boolean toneOnHold;

	/**
	 * canBeNull && readOnly
	 */
	public OvhEasyMiniPabxHuntingStrategyEnum strategy;

	/**
	 * Number of simultaneous calls
	 *
	 * canBeNull && readOnly
	 */
	public Long numberOfCalls;

	/**
	 * Reject anonymous calls
	 *
	 * canBeNull && readOnly
	 */
	public Boolean anonymousCallRejection;

	/**
	 * True if the ring back tone is enabled
	 *
	 * canBeNull && readOnly
	 */
	public Boolean toneRingback;
}
