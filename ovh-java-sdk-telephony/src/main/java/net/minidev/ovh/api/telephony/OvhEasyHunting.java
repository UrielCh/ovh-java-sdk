package net.minidev.ovh.api.telephony;

/**
 * OVH easy calls queues
 */
public class OvhEasyHunting {
	/**
	 * General type of the service
	 *
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
	 * Tone played just before call is hang up
	 *
	 * canBeNull && readOnly
	 */
	public Long toneOnClosing;

	/**
	 * The presented number when bridging calls
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxDialplanNumberPresentationEnum showCallerNumber;

	/**
	 * Max wait time when caller is in queue (in seconds)
	 *
	 * canBeNull && readOnly
	 */
	public Long maxWaitTime;

	/**
	 * Description of the service
	 *
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
	 * Does the service have extended CCS options enabled?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isCCS;

	/**
	 * Tone played when call is picked up
	 *
	 * canBeNull && readOnly
	 */
	public Long toneOnOpening;

	/**
	 * Feature of the service
	 *
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

	/**
	 * Enable/Disable the status change IVR on your callcenter. The IVR is enabled by default.
	 *
	 * canBeNull && readOnly
	 */
	public Boolean statusIvrEnabled;
}
