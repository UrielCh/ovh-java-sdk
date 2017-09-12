package net.minidev.ovh.api.telephony;

/**
 * Fax service
 */
public class OvhFax {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeServiceEnum serviceType;

	/**
	 * canBeNull && readOnly
	 */
	public String[] offers;

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
