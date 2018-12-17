package net.minidev.ovh.api.nichandle.emailchange;

import java.util.Date;
import net.minidev.ovh.api.nichandle.changeemail.OvhTaskStateEnum;

/**
 * Task running an email change on an account
 */
public class OvhTask {
	/**
	 * End date of that request
	 *
	 * canBeNull && readOnly
	 */
	public Date dateDone;

	/**
	 * The email address to change for
	 *
	 * canBeNull && readOnly
	 */
	public String newEmail;

	/**
	 * Current state of the request
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Creation date of that request
	 *
	 * canBeNull && readOnly
	 */
	public Date dateRequest;
}
