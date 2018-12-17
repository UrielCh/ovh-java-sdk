package net.minidev.ovh.api.msservices;

/**
 * Spam and Antivirus configuration
 */
public class OvhSpamAndVirusConfiguration {
	/**
	 * If message is a virus change its subject
	 *
	 * canBeNull
	 */
	public Boolean tagVirus;

	/**
	 * If message is a spam change its subject
	 *
	 * canBeNull
	 */
	public Boolean tagSpam;

	/**
	 * If message is a spam delete it
	 *
	 * canBeNull
	 */
	public Boolean deleteSpam;

	/**
	 * Check DKIM of message
	 *
	 * canBeNull
	 */
	public Boolean checkDKIM;

	/**
	 * Check SPF of message
	 *
	 * canBeNull
	 */
	public Boolean checkSPF;

	/**
	 * If message is a virus delete it
	 *
	 * canBeNull
	 */
	public Boolean deleteVirus;

	/**
	 * If message is a spam or virus put in junk. Overridden by deleteSpam or deleteVirus
	 *
	 * canBeNull
	 */
	public Boolean putInJunk;
}
