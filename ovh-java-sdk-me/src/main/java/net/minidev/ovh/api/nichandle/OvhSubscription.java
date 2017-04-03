package net.minidev.ovh.api.nichandle;

/**
 * List of all OVH things you can subscribe to
 */
public class OvhSubscription {
	/**
	 * Determine whether you are registered or not
	 *
	 * canBeNull && readOnly
	 */
	public Boolean registered;

	/**
	 * The type of subscription
	 *
	 * canBeNull && readOnly
	 */
	public String type;
}
