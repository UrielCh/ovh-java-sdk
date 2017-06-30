package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Informations related to the current RMA step status
 */
public class OvhRmaStep {
	/**
	 * The name of the RMA step
	 *
	 * canBeNull
	 */
	public OvhRmaStepNameEnum name;

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
	public String infos;

	/**
	 * Status of the step
	 *
	 * canBeNull
	 */
	public OvhRmaStepStatusEnum status;
}
