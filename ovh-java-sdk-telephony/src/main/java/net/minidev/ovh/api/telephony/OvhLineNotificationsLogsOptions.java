package net.minidev.ovh.api.telephony;

/**
 * Error logging notifications options
 */
public class OvhLineNotificationsLogsOptions {
	/**
	 * Send a blank notification if there is no diagnosticReports entries for the period
	 *
	 * canBeNull
	 */
	public Boolean sendIfNull;

	/**
	 * Email address where to send notifications
	 *
	 * canBeNull
	 */
	public String email;

	/**
	 * Frequency at which the notifications will be send
	 *
	 * canBeNull
	 */
	public OvhLineNotificationsLogsFrequencyEnum frequency;
}
