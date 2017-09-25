package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Event of a conference (participant left/join)
 */
public class OvhConferenceHistoryEvent {
	/**
	 * The date of the conference event
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * The caller id of the participant
	 *
	 * canBeNull
	 */
	public String callerid;

	/**
	 * The nature of the event : left/join
	 *
	 * canBeNull
	 */
	public String type;
}
