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
