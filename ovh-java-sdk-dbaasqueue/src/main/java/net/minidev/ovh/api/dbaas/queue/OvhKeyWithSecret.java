package net.minidev.ovh.api.dbaas.queue;

/**
 * KeyWithSecret
 */
public class OvhKeyWithSecret {
	/**
	 * Key name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Human ID of the key's application
	 *
	 * canBeNull && readOnly
	 */
	public String humanAppId;

	/**
	 * Key ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Key secret
	 *
	 * canBeNull && readOnly
	 */
	public String secret;
}
