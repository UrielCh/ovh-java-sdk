package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Describe device informations of a Modem
 */
public class OvhDeviceModemInfo {
	/**
	 * Software Version
	 *
	 * canBeNull
	 */
	public String softVersion;

	/**
	 * Modem mac address
	 *
	 * canBeNull
	 */
	public String macAddress;

	/**
	 * Organizational Unique Identifier
	 *
	 * canBeNull
	 */
	public String oui;

	/**
	 * Modem serial key
	 *
	 * canBeNull
	 */
	public String serial;

	/**
	 * login used for ppp protocol
	 *
	 * canBeNull
	 */
	public String pppLogin;

	/**
	 * Time of last information refresh
	 *
	 * canBeNull
	 */
	public Date lastUpdate;

	/**
	 * Modem ip address
	 *
	 * canBeNull
	 */
	public String ip;

	/**
	 * Modem type of model
	 *
	 * canBeNull
	 */
	public String model;

	/**
	 * Modem brand
	 *
	 * canBeNull
	 */
	public String brand;

	/**
	 * Protocol used for connection
	 *
	 * canBeNull
	 */
	public String overEthernet;
}
