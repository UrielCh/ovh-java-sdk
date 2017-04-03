package net.minidev.ovh.api.cloud.billingview;

/**
 * UsedCredits
 */
public class OvhUsedCredits {
	/**
	 * Total credit that will be used to pay the bill
	 *
	 * canBeNull && readOnly
	 */
	public Double totalCredit;

	/**
	 * Details about credits that will be used
	 *
	 * canBeNull && readOnly
	 */
	public OvhUsedCredit[] details;
}
