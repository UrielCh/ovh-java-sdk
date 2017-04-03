package net.minidev.ovh.api.telephony;

/**
 * Represent the delay between two portability steps
 */
public class OvhPortabilityStepDuration {
	/**
	 * The delay's unit
	 *
	 * canBeNull
	 */
	public OvhPortabilityStepDurationUnitEnum unit;

	/**
	 * The quantity of delay
	 *
	 * canBeNull
	 */
	public Long quantity;
}
