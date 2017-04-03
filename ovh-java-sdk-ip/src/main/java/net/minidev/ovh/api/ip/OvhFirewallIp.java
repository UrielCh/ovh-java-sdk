package net.minidev.ovh.api.ip;

/**
 * Your IP on firewall
 */
public class OvhFirewallIp {
	/**
	 * canBeNull && readOnly
	 */
	public String ipOnFirewall;

	/**
	 * Current state of your ip on firewall
	 *
	 * canBeNull && readOnly
	 */
	public OvhFirewallStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean enabled;
}
