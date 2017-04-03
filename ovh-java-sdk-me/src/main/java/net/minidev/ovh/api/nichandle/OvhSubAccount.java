package net.minidev.ovh.api.nichandle;

import java.util.Date;

/**
 * Sub Account
 */
public class OvhSubAccount {
	/**
	 * This sub-account description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * This sub-account id
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
}
