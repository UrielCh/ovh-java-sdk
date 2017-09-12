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
	 * name of resource
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

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
}
