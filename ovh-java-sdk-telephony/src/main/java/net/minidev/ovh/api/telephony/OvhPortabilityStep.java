package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * A step in the portability process
 */
public class OvhPortabilityStep {
	/**
	 * The theoric delay between the previous step's done date and this step's done date
	 *
	 * canBeNull
	 */
	public OvhPortabilityStepDuration duration;

	/**
	 * The name of the portability step
	 *
	 * canBeNull
	 */
	public OvhPortabilityStepNameEnum name;

	/**
	 * A brief description of the step
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * The date when this step was done
	 *
	 * canBeNull
	 */
	public Date doneDate;

	/**
	 * Additional informations about the step
	 *
	 * canBeNull
	 */
	public OvhPortabilityStepInfos infos;

	/**
	 * Indicates if the step is to do, currently doing or done
	 *
	 * canBeNull
	 */
	public OvhPortabilityStepStatusEnum status;
}
