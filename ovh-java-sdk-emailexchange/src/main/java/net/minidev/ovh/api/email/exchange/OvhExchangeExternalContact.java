package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * External contact for this exchange service
 */
public class OvhExchangeExternalContact {
	/**
	 * Contact last name
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

	/**
	 * Contact first name
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

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
	 * If specified, indicates to which organization this external contact belongs (Exchange 2010 only)
	 *
	 * canBeNull && readOnly
	 */
	public String organization2010;

	/**
	 * Task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
