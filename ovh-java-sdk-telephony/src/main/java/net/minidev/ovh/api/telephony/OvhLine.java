package net.minidev.ovh.api.telephony;

/**
 * Line service
 */
public class OvhLine {
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
	 * The line offers (Deprecated, prefer "name" in getPublicOffer)
	 *
	 * canBeNull && readOnly
	 */
	public String[] offers;

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
