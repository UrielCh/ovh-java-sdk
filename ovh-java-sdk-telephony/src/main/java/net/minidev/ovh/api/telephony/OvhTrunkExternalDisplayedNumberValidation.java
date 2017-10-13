package net.minidev.ovh.api.telephony;

/**
 * Trunk external displayed number validation
 */
public class OvhTrunkExternalDisplayedNumberValidation {
	/**
	 * Validation code to type during phone call
	 *
	 * canBeNull
	 */
	public String validationCode;

	/**
	 * telephony.Task id of the validation phone call
	 *
	 * canBeNull
	 */
	public Long phoneCallTaskId;
}
