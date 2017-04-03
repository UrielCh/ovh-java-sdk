package net.minidev.ovh.api.sms;

/**
 * A structure describing ptt details
 */
public class OvhPttDetails {
	/**
	 * Ptt volatility type
	 *
	 * canBeNull
	 */
	public OvhPttDurationTypeEnum duration;

	/**
	 * Ptt short description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Ptt informations
	 *
	 * canBeNull
	 */
	public String comment;
}
