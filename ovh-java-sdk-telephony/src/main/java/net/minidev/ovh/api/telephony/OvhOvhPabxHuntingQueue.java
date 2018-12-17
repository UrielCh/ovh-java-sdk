package net.minidev.ovh.api.telephony;

/**
 * Calls queue
 */
public class OvhOvhPabxHuntingQueue {
	/**
	 * Key to press to disable record
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxHuntingQueueRecordDisablingDigitEnum recordDisablingDigit;

	/**
	 * Follow the calls forwarding
	 *
	 * canBeNull && readOnly
	 */
	public Boolean followCallForwards;

	/**
	 * canBeNull && readOnly
	 */
	public Long queueId;

	/**
	 * The maximum waiting time (in seconds) in the queue
	 *
	 * canBeNull && readOnly
	 */
	public Long maxWaitTime;

	/**
	 * The id of the OvhPabxSound played to caller when on hold
	 *
	 * canBeNull && readOnly
	 */
	public Long soundOnHold;

	/**
	 * The additionnal parameter of the on closure action
	 *
	 * canBeNull && readOnly
	 */
	public String actionOnClosureParam;

	/**
	 * The name of the queue
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Language of the sound played to the caller to inform that he can disable record
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxHuntingQueueRecordDisablingLanguageEnum recordDisablingLanguage;

	/**
	 * Allow the caller to disable call record by pressing a key
	 *
	 * canBeNull && readOnly
	 */
	public Boolean askForRecordDisabling;

	/**
	 * Action executed when caller enters a full queue
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxQueueActionEnum actionOnOverflow;

	/**
	 * The maximum of people waiting in the queue
	 *
	 * canBeNull && readOnly
	 */
	public Long maxMember;

	/**
	 * Enable record on calls in queue
	 *
	 * canBeNull && readOnly
	 */
	public Boolean record;

	/**
	 * The calls dispatching strategy
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxHuntingQueueStrategyEnum strategy;

	/**
	 * Action executed when there is no member in queue
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxQueueActionEnum actionOnClosure;

	/**
	 * The additionnal parameter of the overflow action
	 *
	 * canBeNull && readOnly
	 */
	public String actionOnOverflowParam;
}
