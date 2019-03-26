package net.minidev.ovh.api.dedicated;

/**
 * Get list of compatible firewall binaries
 */
public class OvhBinaryFirewall {
	/**
	 * List of compatible asdm binaries names
	 *
	 * canBeNull
	 */
	public String[] asdm;

	/**
	 * canBeNull
	 */
	public OvhProfileFirewallEnum type;

	/**
	 * List of compatible asa binaries names
	 *
	 * canBeNull
	 */
	public String[] asa;
}
