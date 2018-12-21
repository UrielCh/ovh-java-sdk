package net.minidev.ovh.api.telephony;

/**
 * Fax properties
 */
public class OvhFaxProperties {
	/**
	 * canBeNull && readOnly
	 */
	public String receiver;

	/**
	 * canBeNull && readOnly
	 */
	public OvhFaxQualityEnum faxQuality;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean rejectAnonymous;

	/**
	 * canBeNull && readOnly
	 */
	public String callNumber;

	/**
	 * canBeNull && readOnly
	 */
	public String sender;

	/**
	 * canBeNull && readOnly
	 */
	public String countryCode;

	/**
	 * canBeNull && readOnly
	 */
	public String[] redirectionEmail;

	/**
	 * canBeNull && readOnly
	 */
	public String fromName;

	/**
	 * canBeNull && readOnly
	 */
	public OvhFaxMailFormatEnum mailFormat;

	/**
	 * canBeNull && readOnly
	 */
	public OvhFaxSendingTries faxMaxCall;

	/**
	 * canBeNull && readOnly
	 */
	public String faxTagLine;

	/**
	 * canBeNull && readOnly
	 */
	public String fromEmail;
}
