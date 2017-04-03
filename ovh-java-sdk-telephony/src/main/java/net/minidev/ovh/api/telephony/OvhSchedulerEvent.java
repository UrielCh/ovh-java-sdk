package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Scheduled event
 */
public class OvhSchedulerEvent {
	/**
	 * The unique ICS event identifier
	 *
	 * canBeNull && readOnly
	 */
	public String uid;

	/**
	 * The beginning date of the event
	 *
	 * canBeNull && readOnly
	 */
	public Date dateStart;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * The ending date of the event
	 *
	 * canBeNull && readOnly
	 */
	public Date dateEnd;

	/**
	 * The category of the event
	 *
	 * canBeNull && readOnly
	 */
	public OvhSchedulerCategoryEnum categories;

	/**
	 * canBeNull && readOnly
	 */
	public String title;
}
