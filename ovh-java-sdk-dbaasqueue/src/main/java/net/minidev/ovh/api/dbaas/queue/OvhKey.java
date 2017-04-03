package net.minidev.ovh.api.dbaas.queue;

/**
 * Key
 */
public class OvhKey {
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
}
