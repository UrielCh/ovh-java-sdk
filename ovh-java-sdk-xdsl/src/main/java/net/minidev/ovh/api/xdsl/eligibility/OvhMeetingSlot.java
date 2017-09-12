package net.minidev.ovh.api.xdsl.eligibility;

import java.util.Date;

/**
 * Represents a time slot for a meeting
 */
public class OvhMeetingSlot {
	/**
	 * The end of the time slot
	 *
	 * canBeNull
	 */
	public Date endDate;

	/**
	 * The beginning of the time slot
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
