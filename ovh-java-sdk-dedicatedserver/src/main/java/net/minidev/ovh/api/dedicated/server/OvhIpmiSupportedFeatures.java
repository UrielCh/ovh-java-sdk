package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing the IPMI supported features
 */
public class OvhIpmiSupportedFeatures {
	/**
	 * Access to the virtual serial port of your server through an SSH client
	 *
	 * canBeNull
	 */
	public Boolean serialOverLanSshKey;

	/**
	 * Access to the KVM through a Java web launch application
	 *
	 * canBeNull
	 */
	public Boolean kvmipJnlp;

	/**
	 * Access to the KVM through an HTML web interface
	 *
	 * canBeNull
	 */
	public Boolean kvmipHtml5URL;

	/**
	 * Access to the virtual serial port of your server through an HTML command line interface
	 *
	 * canBeNull
	 */
	public Boolean serialOverLanURL;
}
