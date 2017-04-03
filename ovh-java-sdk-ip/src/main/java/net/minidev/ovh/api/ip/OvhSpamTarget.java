package net.minidev.ovh.api.ip;

/**
 * Spam's target information
 */
public class OvhSpamTarget {
	/**
	 * IP address of the target
	 *
	 * canBeNull
	 */
	public String destinationIp;

	/**
	 * Timestamp when the email was sent
	 *
	 * canBeNull
	 */
	public Long date;

	/**
	 * Spam score for the email
	 *
	 * canBeNull
	 */
	public Long spamscore;

	/**
	 * The message-id of the email
	 *
	 * canBeNull
	 */
	public String messageId;
}
