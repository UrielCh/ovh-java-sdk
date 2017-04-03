package net.minidev.ovh.api.ip;

/**
 * Spam statistics about an IP address
 */
public class OvhSpamStats {
	/**
	 * Number of emails sent
	 *
	 * canBeNull
	 */
	public Long total;

	/**
	 * Detailed list of the spams
	 *
	 * canBeNull
	 */
	public OvhSpamTarget[] detectedSpams;

	/**
	 * Number of spams sent
	 *
	 * canBeNull
	 */
	public Long numberOfSpams;

	/**
	 * Average spam score.
	 *
	 * canBeNull
	 */
	public Long averageSpamscore;

	/**
	 * Time when the IP address was blocked
	 *
	 * canBeNull
	 */
	public Long timestamp;
}
