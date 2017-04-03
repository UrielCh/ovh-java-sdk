package net.minidev.ovh.api.sms;

/**
 * A structure describing all information about quota informations
 */
public class OvhSmsSendingReport {
	/**
	 * canBeNull
	 */
	public Double totalCreditsRemoved;

	/**
	 * canBeNull
	 */
	public String[] invalidReceivers;

	/**
	 * canBeNull
	 */
	public Long[] ids;

	/**
	 * canBeNull
	 */
	public String[] validReceivers;
}
