package net.minidev.ovh.api.monitoring;

/**
 * Configuration of the firewall
 */
public class OvhFirewallConfig {
	/**
	 * List of allowed networks to the NSCA receiver
	 *
	 * canBeNull && readOnly
	 */
	public String[] nsca;

	/**
	 * List of allowed networks to the LiveStatus API
	 *
	 * canBeNull && readOnly
	 */
	public String[] livestatus;

	/**
	 * List of allowed networks to the Thruk web interface
	 *
	 * canBeNull && readOnly
	 */
	public String[] thruk;
}
