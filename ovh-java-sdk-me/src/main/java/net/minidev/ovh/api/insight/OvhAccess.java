package net.minidev.ovh.api.insight;

import java.util.Date;

/**
 * Insight access token
 */
public class OvhAccess {
	/**
	 * Token creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Access token
	 *
	 * canBeNull && readOnly
	 */
	public String access;

	/**
	 * Token expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expireAt;
}
