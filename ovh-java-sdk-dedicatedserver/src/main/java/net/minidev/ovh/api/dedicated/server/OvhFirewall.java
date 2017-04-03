package net.minidev.ovh.api.dedicated.server;

/**
 * Firewall attached to this server
 */
public class OvhFirewall {
	/**
	 * transparent mode : device is invisible on the network; routed mode : the security appliance is considered to be a router hop in the network
	 *
	 * canBeNull && readOnly
	 */
	public OvhFirewallModeEnum mode;

	/**
	 * canBeNull && readOnly
	 */
	public String firewall;

	/**
	 * Firewall management IP
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Firewall model
	 *
	 * canBeNull && readOnly
	 */
	public OvhFirewallModelEnum model;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean enabled;
}
