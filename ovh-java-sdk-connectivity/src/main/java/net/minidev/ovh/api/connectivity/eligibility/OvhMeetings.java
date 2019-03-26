package net.minidev.ovh.api.connectivity.eligibility;

/**
 * List of available meeting time slots
 */
public class OvhMeetings {
	/**
	 * Whether or not it is possible to book a fake meeting
	 *
	 * canBeNull
	 */
	public Boolean canBookFakeMeeting;

	/**
	 * A time slot
	 *
	 * canBeNull
	 */
	public OvhMeetingSlot[] meetingSlots;
}
