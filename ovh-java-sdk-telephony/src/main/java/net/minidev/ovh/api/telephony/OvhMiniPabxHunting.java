package net.minidev.ovh.api.telephony;

/**
 * MiniPabx Hunting
 */
public class OvhMiniPabxHunting {
	/**
	 * Maximum numbers of callers in the queue
	 *
	 * canBeNull && readOnly
	 */
	public Long queueSize;

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
	 * The maximum waiting time in the calls queue
	 *
	 * canBeNull && readOnly
	 */
	public Long onHoldTimer;

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
	 * Reject anonymous calls
	 *
	 * canBeNull && readOnly
	 */
	public Boolean anonymousCallRejection;

	/**
	 * canBeNull && readOnly
	 */
	public OvhEasyMiniPabxHuntingStrategyEnum strategy;

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
