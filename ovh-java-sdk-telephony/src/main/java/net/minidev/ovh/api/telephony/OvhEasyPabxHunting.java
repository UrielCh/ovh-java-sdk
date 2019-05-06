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
	 * True if the tone on closure is enabled
	 *
	 * canBeNull && readOnly
	 */
	public Boolean toneOnClosure;

	/**
	 * canBeNull && readOnly
	 */
	public OvhEasyMiniPabxHuntingPatternEnum pattern;

	/**
	 * The maximum no-reply time before forwarding the call to the voicemail
	 *
	 * canBeNull && readOnly
	 */
	public Long noReplyTimer;

	/**
	 * Sound ID of ringback tone
	 *
	 * canBeNull && readOnly
	 */
	public Long toneRingbackSoundId;

	/**
	 * Sound ID of on-hold tone
	 *
	 * canBeNull && readOnly
	 */
	public Long toneOnHoldSoundId;

	/**
	 * Number of simultaneous calls
	 *
	 * canBeNull && readOnly
	 */
	public Long numberOfCalls;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

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

	/**
	 * Sound ID of on-closure tone
	 *
	 * canBeNull && readOnly
	 */
	public Long toneOnClosureSoundId;
}
