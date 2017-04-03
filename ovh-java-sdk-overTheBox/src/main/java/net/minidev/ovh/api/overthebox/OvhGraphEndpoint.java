package net.minidev.ovh.api.overthebox;

/**
 * Parameters required to query metrics from OpenTSDB
 */
public class OvhGraphEndpoint {
	/**
	 * The read-only token ID
	 *
	 * canBeNull
	 */
	public String readTokenID;

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
