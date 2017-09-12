package net.minidev.ovh.api.iploadbalancing;

/**
 * a list of {zone, nat Ip}
 */
public class OvhNatIps {
	/**
	 * canBeNull
	 */
	public String zone;

	/**
	 * canBeNull
	 */
	public String[] ip;
}
