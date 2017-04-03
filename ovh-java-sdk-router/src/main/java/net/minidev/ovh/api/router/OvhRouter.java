package net.minidev.ovh.api.router;

/**
 * Router
 */
public class OvhRouter {
	/**
	 * The internal name of your Router offer
	 *
	 * canBeNull && readOnly
	 */
	public String service;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
