package net.minidev.ovh.api.dedicated.server;

/**
 * Server IPMI interface
 */
public class OvhIpmi {
	/**
	 * A structure describing the IPMI supported features
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpmiSupportedFeatures supportedFeatures;

	/**
	 * true, if IPMI is available on this server
	 *
	 * canBeNull && readOnly
	 */
	public Boolean activated;
}
