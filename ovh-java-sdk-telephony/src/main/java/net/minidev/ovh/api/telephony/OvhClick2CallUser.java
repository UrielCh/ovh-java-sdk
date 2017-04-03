package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * User of the click 2 call
 */
public class OvhClick2CallUser {
	/**
	 * Contact identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * login of the click 2 call user
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Date when user was created
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDateTime;
}
