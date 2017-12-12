package net.minidev.ovh.api.secret;

import java.util.Date;

/**
 * A secret
 */
public class OvhSecret {
	/**
	 * Expiration time of the secret
	 *
	 * canBeNull
	 */
	public Date expiration;

	/**
	 * The secret
	 *
	 * canBeNull
	 */
	public String secret;
}
