package net.minidev.ovh.api.email.pro;

import java.util.Date;

/**
 * External contact for this pro service
 */
public class OvhExternalContact {
	/**
	 * Contact first name
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

	/**
	 * Contact last name
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

	/**
	 * Hide the contact in Global Address List
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hiddenFromGAL;

	/**
	 * Contact display name
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Contact initals
	 *
	 * canBeNull && readOnly
	 */
	public String initials;

	/**
	 * Contact email
	 *
	 * canBeNull && readOnly
	 */
	public String externalEmailAddress;

	/**
	 * Contact id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Contact state
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
	 * Task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
