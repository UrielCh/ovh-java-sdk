package net.minidev.ovh.api.telephony;

/**
 * Screenlist condition
 */
public class OvhEasyHuntingScreenListsConditions {
	/**
	 * Type of screenlist
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxDialplanExtensionConditionScreenListTypeEnum screenListType;

	/**
	 * Screenlist based on the presented caller number
	 *
	 * canBeNull && readOnly
	 */
	public String callerIdNumber;

	/**
	 * canBeNull && readOnly
	 */
	public Long conditionId;

	/**
	 * Screenlist based on the destination number
	 *
	 * canBeNull && readOnly
	 */
	public String destinationNumber;
}
