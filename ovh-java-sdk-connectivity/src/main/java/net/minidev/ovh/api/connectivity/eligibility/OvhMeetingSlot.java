package net.minidev.ovh.api.connectivity.eligibility;

import java.util.Date;

/**
 * Represents a time slot for a meeting
 */
public class OvhMeetingSlot {
	/**
	 * End date
	 *
	 * canBeNull
	 */
	public Date endDate;

	/**
	 * Start date
	 *
	 * canBeNull
	 */
	public Date startDate;

	/**
	 * An opaque string that represents an intervention unit
	 *
	 * canBeNull
	 */
	public String uiCode;
}
