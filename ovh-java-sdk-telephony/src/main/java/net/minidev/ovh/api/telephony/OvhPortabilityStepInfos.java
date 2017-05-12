package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Additional informations about the portability step
 */
public class OvhPortabilityStepInfos {
	/**
	 * The last portability due date that has been proposed
	 *
	 * canBeNull
	 */
	public Date lastProposedDate;

	/**
	 * If the step status is "error", it is the reason
	 *
	 * canBeNull
	 */
	public String reason;

	/**
	 * A code representing the reason
	 *
	 * canBeNull
	 */
	public String reasonType;
}
