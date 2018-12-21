package net.minidev.ovh.api.router;

/**
 * Network Snat
 */
public class OvhSnat {
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
	 * Destination IP or network
	 *
	 * canBeNull && readOnly
	 */
	public String destinationNet;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * New source IP
	 *
	 * canBeNull && readOnly
	 */
	public String newSourceNet;

	/**
	 * New destination port number
	 *
	 * canBeNull && readOnly
	 */
	public Long newSourcePort;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
