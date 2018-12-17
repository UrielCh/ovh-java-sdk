package net.minidev.ovh.api.iploadbalancing;

import net.minidev.ovh.api.iploadbalancing.status.OvhComponent;
import net.minidev.ovh.api.iploadbalancing.status.OvhService;

/**
 * The global status of a Load Balancer
 */
public class OvhStatus {
	/**
	 * The Load Balancer servers status informations
	 *
	 * canBeNull
	 */
	public OvhComponent servers;

	/**
	 * The Load Balancer frontends status informations
	 *
	 * canBeNull
	 */
	public OvhComponent frontends;

	/**
	 * The Load Balancer service status informations
	 *
	 * canBeNull
	 */
	public OvhService service;

	/**
	 * The Load Balancer farms status informations
	 *
	 * canBeNull
	 */
	public OvhComponent farms;
}
