package net.minidev.ovh.api.xdsl;

import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhProtocolTypeEnum;

/**
 * Port Mappings
 */
public class OvhPortMapping {
	/**
	 * Protocol of the port mapping (TCP / UDP)
	 *
	 * canBeNull && readOnly
	 */
	public OvhProtocolTypeEnum protocol;

	/**
	 * The port on the Internal Client that will get the connections
	 *
	 * canBeNull && readOnly
	 */
	public Long internalPort;

	/**
	 * The last port of the interval on the External Client that will get the connections
	 *
	 * canBeNull && readOnly
	 */
	public Long externalPortEnd;

	/**
	 * Name of the port mapping entry
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Description of the Port Mapping
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * ID of the port mapping entry
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * An ip which will access to the defined rule. Default : no restriction applied
	 *
	 * canBeNull && readOnly
	 */
	public String allowedRemoteIp;

	/**
	 * The IP address of the destination of the packets
	 *
	 * canBeNull && readOnly
	 */
	public String internalClient;

	/**
	 * ID of the ongoing todo (NULL if none)
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * External Port that the modem will listen on. List of externalPorts not available for now in the API : 8, 21, 68, 5060, 21800-21805, 51005
	 *
	 * canBeNull && readOnly
	 */
	public Long externalPortStart;
}
