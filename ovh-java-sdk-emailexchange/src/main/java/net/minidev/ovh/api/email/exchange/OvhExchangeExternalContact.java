package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * External contact for this exchange service
 */
public class OvhExchangeExternalContact {
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
	 * Contact initals
	 *
	 * canBeNull && readOnly
	 */
	public String initials;

	/**
	 * Contact display name
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Contact email
	 *
	 * canBeNull && readOnly
	 */
	public String externalEmailAddress;

	/**
	 * Contact state
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

	/**
	 * Contact id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * If specified, indicates to which organization this external contact belongs (Exchange 2010 only)
	 *
	 * canBeNull && readOnly
	 */
	public String organization2010;

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
