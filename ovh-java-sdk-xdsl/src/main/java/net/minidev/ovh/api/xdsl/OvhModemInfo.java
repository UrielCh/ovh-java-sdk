package net.minidev.ovh.api.xdsl;

/**
 * Describe general information of a Modem
 */
public class OvhModemInfo {
	/**
	 * Hardware information
	 *
	 * canBeNull
	 */
	public OvhDeviceModemInfo device;

	/**
	 * Modem Connection information
	 *
	 * canBeNull
	 */
	public OvhStatsModemInfo statistics;
}
