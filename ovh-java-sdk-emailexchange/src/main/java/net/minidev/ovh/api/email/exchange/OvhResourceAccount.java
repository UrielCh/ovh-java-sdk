package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Exchange resource account
 */
public class OvhResourceAccount {
	/**
	 * resource as email
	 *
	 * canBeNull && readOnly
	 */
	public String resourceEmailAddress;

	/**
	 * maximum duration in minutes for meeting requests
	 *
	 * canBeNull && readOnly
	 */
	public Long maximumDuration;

	/**
	 * name of resource
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * remove any text in the message body of incoming meeting requests on resourceAccount
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteComments;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * resource type
	 *
	 * canBeNull && readOnly
	 */
	public OvhResourceTypeEnum type;

	/**
	 * task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * number of the same equipment or capacity of a room
	 *
	 * canBeNull && readOnly
	 */
	public Long capacity;

	/**
	 * meeting organizer's name is used as the subject of the meeting request
	 *
	 * canBeNull && readOnly
	 */
	public Boolean addOrganizerToSubject;

	/**
	 * remove email subject of incoming meeting requests on resourceAccount
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteSubject;

	/**
	 * maximum number of days in advance that the resource can be reserved
	 *
	 * canBeNull && readOnly
	 */
	public Long bookingWindow;

	/**
	 * resource location name
	 *
	 * canBeNull && readOnly
	 */
	public String location;

	/**
	 * resource can be scheduled by more than one person during the same time period
	 *
	 * canBeNull && readOnly
	 */
	public Boolean allowConflict;

	/**
	 * account state
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

	/**
	 * granted right on a calendar of that resourceAccount
	 *
	 * canBeNull && readOnly
	 */
	public OvhShowMeetingDetailsEnum showMeetingDetails;
}
