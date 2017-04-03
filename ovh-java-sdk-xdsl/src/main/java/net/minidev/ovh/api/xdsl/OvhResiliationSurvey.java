package net.minidev.ovh.api.xdsl;

/**
 * Information about the reason for the resiliation
 */
public class OvhResiliationSurvey {
	/**
	 * Comment about this resiliation
	 *
	 * canBeNull
	 */
	public String comment;

	/**
	 * Type of reason for the resiliation
	 *
	 * canBeNull
	 */
	public OvhResiliationReasonEnum type;
}
