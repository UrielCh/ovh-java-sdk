package net.minidev.ovh.api.telephony;

/**
 * Line service
 */
public class OvhLine {
	/**
	 * The line offers (Deprecated, prefer "name" in getPublicOffer)
	 *
	 * canBeNull && readOnly
	 */
	public String[] offers;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeServiceEnum serviceType;

	/**
	 * The line offers
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineOffer getPublicOffer;

	/**
	 * Ability to manage SIP password on this service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canChangePassword;

	/**
	 * canBeNull && readOnly
	 */
	public Long simultaneousLines;

	/**
	 * The infrastructure where is configured the line
	 *
	 * canBeNull && readOnly
	 */
	public String infrastructure;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Is this line attached to a phone that belongs to another line?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isAttachedToOtherLinesPhone;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Send notifications about Line's diagnosticReports
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineNotificationsOptions notifications;
}
