package net.minidev.ovh.api.xdsl.templatemodem;

import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhProtocolTypeEnum;

/**
 * PortMapping Configuration for Modem Template
 */
public class OvhPortMapping {
	/**
	 * Protocol of the port mapping (TCP / UDP)
	 *
	 * canBeNull
	 */
	public OvhProtocolTypeEnum protocol;

	/**
	 * The port on the Internal Client that will get the connections
	 *
	 * canBeNull
	 */
	public Long internalPort;

	/**
	 * The last port of the interval on the External Client that will get the connections
	 *
	 * canBeNull
	 */
	public Long externalPortEnd;

	/**
	 * Name of the port mapping entry
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Description of the Port Mapping
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * An ip which will access to the defined rule. Default : no restriction applied
	 *
	 * canBeNull
	 */
	public String allowedRemoteIp;

	/**
	 * The IP address of the destination of the packets
	 *
	 * canBeNull
	 */
	public String internalClient;

	/**
	 * External Port that the modem will listen on. List of externalPorts not available for now in the API : 8, 21, 68, 5060, 21800-21805, 51005
	 *
	 * canBeNull
	 */
	public Long externalPortStart;
}
