package net.minidev.ovh.api.cloud.user;

import java.util.Date;

/**
 * UserDetail
 */
public class OvhUserDetail {
	/**
	 * User password
	 *
	 * canBeNull && readOnly
	 */
	public String password;

	/**
	 * User description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * User id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * User creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * User status
	 *
	 * canBeNull && readOnly
	 */
	public OvhUserStatusEnum status;

	/**
	 * Username
	 *
	 * canBeNull && readOnly
	 */
	public String username;
}
