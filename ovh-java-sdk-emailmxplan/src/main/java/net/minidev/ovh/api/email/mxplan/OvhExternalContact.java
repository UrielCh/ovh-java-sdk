package net.minidev.ovh.api.email.mxplan;

import java.util.Date;
import net.minidev.ovh.api.email.pro.OvhObjectStateEnum;

/**
 * External contact for this mxplan service
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
