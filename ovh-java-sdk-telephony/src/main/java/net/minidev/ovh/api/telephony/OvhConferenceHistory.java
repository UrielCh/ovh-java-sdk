package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * List past conferences on your number
 */
public class OvhConferenceHistory {
	/**
	 * The duration of the conference in seconds
	 *
	 * canBeNull && readOnly
	 */
	public Long duration;

	/**
	 * The date the conference began
	 *
	 * canBeNull && readOnly
	 */
	public Date dateBegin;

	/**
	 * The count of unique participants of the conference
	 *
	 * canBeNull && readOnly
	 */
	public Long countParticipants;

	/**
	 * The audio record url if you set recording
	 *
	 * canBeNull && readOnly
	 */
	public String recordUrl;

	/**
	 * The date the conference end
	 *
	 * canBeNull && readOnly
	 */
	public Date dateEnd;

	/**
	 * The id of the conference history
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The events of the conference (participants joining/left)
	 *
	 * canBeNull && readOnly
	 */
	public OvhConferenceHistoryEvent[] events;

	/**
	 * The count of connections to the conference
	 *
	 * canBeNull && readOnly
	 */
	public Long countConnections;
}
