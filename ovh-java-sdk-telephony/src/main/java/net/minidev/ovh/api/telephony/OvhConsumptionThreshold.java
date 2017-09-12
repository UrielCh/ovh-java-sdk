package net.minidev.ovh.api.telephony;

/**
 * The outplan notifications configured for your billing account
 */
public class OvhConsumptionThreshold {
	/**
	 * The notification percentage of maximum outplan
	 *
	 * canBeNull && readOnly
	 */
	public Double percentage;

	/**
	 * The blocking type of the associate lines
	 *
	 * canBeNull && readOnly
	 */
	public OvhOutplanNotificationBlockEnum block;

	/**
	 * The id of the notification
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Override the nichandle email for this notification
	 *
	 * canBeNull && readOnly
	 */
	public String notifyEmail;
}
