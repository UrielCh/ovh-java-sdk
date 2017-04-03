package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Parameters to book a time slot for a meeting
 */
public class OvhBookMeetingSlot {
	/**
	 * The time slot to book, null if fakeMeeting is true
	 *
	 * canBeNull
	 */
	public OvhMeetingSlot meetingSlot;

	/**
	 * Whether or not to book a fake meeting slots (if no slots are available)
	 *
	 * canBeNull
	 */
	public Boolean fakeMeeting;

	/**
	 * The name of the customer
	 *
	 * canBeNull
	 */
	public String name;
}
