package net.minidev.ovh.api.license;

import java.util.Date;

/**
 * Your License options
 */
public class OvhOption {
	/**
	 * Specifies whether this option can be released or not
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canBeDeleted;

	/**
	 * Quantity or corresponding label of the designated option enabled on your license
	 *
	 * canBeNull && readOnly
	 */
	public String amount;

	/**
	 * This option designation
	 *
	 * canBeNull && readOnly
	 */
	public OvhOptionLabel label;

	/**
	 * This option related version
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * This option expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
