package net.minidev.ovh.api.freefax;

import net.minidev.ovh.api.telephony.OvhFaxQualityEnum;
import net.minidev.ovh.api.telephony.OvhFaxSendingTries;

/**
 * Freefax properties
 */
public class OvhFreefaxProperties {
	/**
	 * Freefax number in international format
	 *
	 * canBeNull && readOnly
	 */
	public String number;

	/**
	 * Quality of fax sending
	 *
	 * canBeNull && readOnly
	 */
	public OvhFaxQualityEnum faxQuality;

	/**
	 * Name of the sender of the email
	 *
	 * canBeNull && readOnly
	 */
	public String fromName;

	/**
	 * Email address to redirect fax response.
	 *
	 * canBeNull && readOnly
	 */
	public String[] redirectionEmail;

	/**
	 * Number of max tentative of fax sending
	 *
	 * canBeNull && readOnly
	 */
	public OvhFaxSendingTries faxMaxCall;

	/**
	 * Customised freefax header
	 *
	 * canBeNull && readOnly
	 */
	public String faxTagLine;

	/**
	 * FROM email header
	 *
	 * canBeNull && readOnly
	 */
	public String fromEmail;
}
