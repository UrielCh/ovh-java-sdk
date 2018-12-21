package net.minidev.ovh.api.telephony;

/**
 * Fax ScreenLists
 */
public class OvhFaxScreen {
	/**
	 * List of numbers not allowed to send a fax
	 *
	 * canBeNull && readOnly
	 */
	public String[] blacklistedNumbers;

	/**
	 * Which list is active (blackist, whitelist or none)
	 *
	 * canBeNull && readOnly
	 */
	public OvhFaxScreenListTypeEnum filteringList;

	/**
	 * List of logins (TSI or ID) allowed to send a fax
	 *
	 * canBeNull && readOnly
	 */
	public String[] whitelistedTSI;

	/**
	 * Number of the fax service
	 *
	 * canBeNull && readOnly
	 */
	public String callNumber;

	/**
	 * Country code of the fax service
	 *
	 * canBeNull && readOnly
	 */
	public String countryCode;

	/**
	 * List of logins (TSI or ID) not allowed to send a fax
	 *
	 * canBeNull && readOnly
	 */
	public String[] blacklistedTSI;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * List of numbers allowed to send a fax
	 *
	 * canBeNull && readOnly
	 */
	public String[] whitelistedNumbers;
}
