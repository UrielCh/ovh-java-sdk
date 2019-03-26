package net.minidev.ovh.api.xdsl.eligibility;

/**
 * List of available meeting time slots
 */
public class OvhMeetingSlots {
	/**
	 * A time slot
	 *
	 * canBeNull
	 */
	public OvhMeetingSlot[] meetingSlots;

	/**
	 * Whether or not it is possible to book a fake meeting
	 *
	 * canBeNull
	 */
	public Boolean canBookFakeMeeting;
}
