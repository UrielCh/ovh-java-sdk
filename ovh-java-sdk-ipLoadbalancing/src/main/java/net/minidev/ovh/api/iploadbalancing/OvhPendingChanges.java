package net.minidev.ovh.api.iploadbalancing;

/**
 * The pending changes for a Load Balancer zone
 */
public class OvhPendingChanges {
	/**
	 * The number of changes waiting to be applied
	 *
	 * canBeNull
	 */
	public Long number;

	/**
	 * The Load Balancer zone with pending changes
	 *
	 * canBeNull
	 */
	public String zone;
}
