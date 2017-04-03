package net.minidev.ovh.api.sms;

/**
 * A structure describing all information about alert threshold informations
 */
public class OvhAlertThreshold {
	/**
	 * canBeNull
	 */
	public String alertEmail;

	/**
	 * canBeNull
	 */
	public Long alertThreshold;

	/**
	 * canBeNull
	 */
	public String alertNumber;

	/**
	 * canBeNull
	 */
	public OvhSupportEnum support;
}
