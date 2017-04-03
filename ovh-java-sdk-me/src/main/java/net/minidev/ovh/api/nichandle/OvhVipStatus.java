package net.minidev.ovh.api.nichandle;

/**
 * VIP Status by Universe
 */
public class OvhVipStatus {
	/**
	 * Is account VIP for Cloud Universe
	 *
	 * canBeNull
	 */
	public Boolean cloud;

	/**
	 * Is account VIP for Dedicated Universe
	 *
	 * canBeNull
	 */
	public Boolean dedicated;

	/**
	 * Is account VIP for Web Universe
	 *
	 * canBeNull
	 */
	public Boolean web;

	/**
	 * Is account VIP for Telecom Universe
	 *
	 * canBeNull
	 */
	public Boolean telecom;
}
