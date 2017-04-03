package net.minidev.ovh.api.hosting.privatedatabase;

/**
 * Parameters required to query metrics from OpenTSDB
 */
public class OvhGraphEndpoint {
	/**
	 * A read-only token ID
	 *
	 * canBeNull
	 */
	public String readTokenId;

	/**
	 * A read-only token
	 *
	 * canBeNull
	 */
	public String readToken;

	/**
	 * The OpenTSDB host
	 *
	 * canBeNull
	 */
	public String host;
}
