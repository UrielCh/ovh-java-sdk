package net.minidev.ovh.api.tsaas;

import java.util.Date;

/**
 * Token to use Warp10 functions
 */
public class OvhWarp10Token {
	/**
	 * maximum number of operations allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxOps;

	/**
	 * protocol
	 *
	 * canBeNull && readOnly
	 */
	public String protocol;

	/**
	 * Timestamp of expiration of the token
	 *
	 * canBeNull && readOnly
	 */
	public Date expiryTimestamp;

	/**
	 * permission
	 *
	 * canBeNull && readOnly
	 */
	public String permissions;

	/**
	 * Description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Maximum depth of the stack allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxFetch;

	/**
	 * Secret part
	 *
	 * canBeNull && readOnly
	 */
	public String secret;

	/**
	 * Id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Maximum number of GTS retrieved allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxGts;

	/**
	 * Query token used to authentificate queries
	 *
	 * canBeNull && readOnly
	 */
	public String queryToken;
}
