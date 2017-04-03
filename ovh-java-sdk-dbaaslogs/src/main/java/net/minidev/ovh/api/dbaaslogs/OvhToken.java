package net.minidev.ovh.api.dbaaslogs;

import java.util.Date;

/**
 * Token
 */
public class OvhToken {
	/**
	 * Token creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Token UUID
	 *
	 * canBeNull && readOnly
	 */
	public String tokenId;

	/**
	 * Token name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Token value
	 *
	 * canBeNull && readOnly
	 */
	public String value;

	/**
	 * Token last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
