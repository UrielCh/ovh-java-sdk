package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Conference service
 */
public class OvhConferenceParticipants {
	/**
	 * The caller number of the participant
	 *
	 * canBeNull && readOnly
	 */
	public String callerNumber;

	/**
	 * Whether or not the participant can talk in the conference
	 *
	 * canBeNull && readOnly
	 */
	public Boolean speak;

	/**
	 * The arrival datetime of the participant in the conference.
	 *
	 * canBeNull && readOnly
	 */
	public Date arrivalDateTime;

	/**
	 * Whether or not the participant is talking
	 *
	 * canBeNull && readOnly
	 */
	public Boolean talking;

	/**
	 * The id of the participant
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Whether or not the participant is active in the room
	 *
	 * canBeNull && readOnly
	 */
	public Boolean floor;

	/**
	 * Whether or not the participant can hear the conference
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hear;

	/**
	 * The current level of the participant audio transmission
	 *
	 * canBeNull && readOnly
	 */
	public Long energy;

	/**
	 * The caller name of the participant
	 *
	 * canBeNull && readOnly
	 */
	public String callerName;
}
