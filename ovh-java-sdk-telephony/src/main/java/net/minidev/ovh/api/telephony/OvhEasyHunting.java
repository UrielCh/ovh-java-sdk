package net.minidev.ovh.api.telephony;

/**
 * OVH easy calls queues
 */
public class OvhEasyHunting {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeServiceEnum serviceType;

	/**
	 * Max number of callers in queue
	 *
	 * canBeNull && readOnly
	 */
	public Long queueSize;

	/**
	 * The voicemail used by the EasyPABX
	 *
	 * canBeNull && readOnly
	 */
	public String voicemail;

	/**
	 * The presented number when bridging calls
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxDialplanNumberPresentationEnum showCallerNumber;

	/**
	 * Tone played just before call is hang up
	 *
	 * canBeNull && readOnly
	 */
	public Long toneOnClosing;

	/**
	 * Max wait time when caller is in queue (in seconds)
	 *
	 * canBeNull && readOnly
	 */
	public Long maxWaitTime;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Reject (hangup) anonymous calls
	 *
	 * canBeNull && readOnly
	 */
	public Boolean anonymousRejection;

	/**
	 * Tone played when call is picked up
	 *
	 * canBeNull && readOnly
	 */
	public Long toneOnOpening;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum featureType;

	/**
	 * Tone played when caller is put on hold
	 *
	 * canBeNull && readOnly
	 */
	public Long toneOnHold;

	/**
	 * The calls dispatching strategy
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxHuntingQueueStrategyEnum strategy;
}
