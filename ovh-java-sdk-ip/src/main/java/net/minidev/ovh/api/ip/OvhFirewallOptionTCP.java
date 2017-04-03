package net.minidev.ovh.api.ip;

/**
 * Possible option for TCP
 */
public class OvhFirewallOptionTCP {
	/**
	 * TCP fragments
	 *
	 * canBeNull
	 */
	public Boolean fragments;

	/**
	 * TCP option
	 *
	 * canBeNull
	 */
	public OvhFirewallTCPOptionEnum option;
}
