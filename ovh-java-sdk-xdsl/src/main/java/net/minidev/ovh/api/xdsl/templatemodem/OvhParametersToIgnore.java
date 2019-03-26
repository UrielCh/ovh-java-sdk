package net.minidev.ovh.api.xdsl.templatemodem;

/**
 * Parameters and values to ignore when apply modem template configuration
 */
public class OvhParametersToIgnore {
	/**
	 * Ignore LAN and DHCP configurations
	 *
	 * canBeNull
	 */
	public Boolean LANandDHCP;

	/**
	 * WLAN names list to ignore. Ignore only listed WLAN
	 *
	 * canBeNull
	 */
	public String[] WLANList;

	/**
	 * Ignore DMZ configuration
	 *
	 * canBeNull
	 */
	public Boolean dmzIP;

	/**
	 * PortMapping names list to ignore. Ignore only listed portMapping
	 *
	 * canBeNull
	 */
	public String[] portMappingList;

	/**
	 * Ignore MTU Size value
	 *
	 * canBeNull
	 */
	public Boolean mtuSize;
}
