package net.minidev.ovh.api.metrics.api;

import java.util.Date;

/**
 * Structure holding the elements about a token
 */
public class OvhToken {
	/**
	 * Is your token revoked?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isRevoked;

	/**
	 * Token expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expiredAt;

	/**
	 * Token creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The actual access token
	 *
	 * canBeNull && readOnly
	 */
	public String access;

	/**
	 * Description of the token
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Id of the token
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Token type: read or write
	 *
	 * canBeNull && readOnly
	 */
	public OvhPermissionEnum type;

	/**
	 * Labels for the token if set
	 *
	 * canBeNull && readOnly
	 */
	public OvhLabel[] labels;
}
