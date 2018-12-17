package net.minidev.ovh.api.router;

/**
 * Network Dnat
 */
public class OvhDnat {
	/**
	 * Destination port number
	 *
	 * canBeNull && readOnly
	 */
	public Long destinationPort;

	/**
	 * Protocol (TCP, UDP)
	 *
	 * canBeNull && readOnly
	 */
	public OvhProtocolEnum protocol;

	/**
	 * New destination IP
	 *
	 * canBeNull && readOnly
	 */
	public String newDestinationNet;

	/**
	 * Source IP or network
	 *
	 * canBeNull && readOnly
	 */
	public String sourceNet;

	/**
	 * New destination port number
	 *
	 * canBeNull && readOnly
	 */
	public Long newDestinationPort;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
