package net.minidev.ovh.api.iploadbalancing.backendtcpcustomerserver;

import net.minidev.ovh.api.iploadbalancing.OvhBackendCustomerServerStatusEnum;
import net.minidev.ovh.api.iploadbalancing.OvhProxyProtocolVersionEnum;
import net.minidev.ovh.api.iploadbalancing.OvhServerState;

/**
 * TCP Farm's Server
 */
public class OvhBackendTCPServer {
	/**
	 * Certificate chain. Allow server certificate verification (Avoid man-in-the-middle attacks)
	 *
	 * canBeNull && readOnly
	 */
	public String chain;

	/**
	 * Backup state
	 *
	 * canBeNull && readOnly
	 */
	public Boolean backup;

	/**
	 * Address of your server
	 *
	 * canBeNull && readOnly
	 */
	public String address;

	/**
	 * Human readable name for your server, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Farm id
	 *
	 * canBeNull && readOnly
	 */
	public Long backendId;

	/**
	 * Weight value. Defaults to 1. 0 if not used in load balancing. Servers with higher weight get more requests.
	 *
	 * canBeNull && readOnly
	 */
	public Long weight;

	/**
	 * SSL ciphering. Probes will also be sent ciphered
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ssl;

	/**
	 * Id of your server
	 *
	 * canBeNull && readOnly
	 */
	public Long serverId;

	/**
	 * Probe state. 'False' if null
	 *
	 * canBeNull && readOnly
	 */
	public Boolean probe;

	/**
	 * Server state
	 *
	 * canBeNull && readOnly
	 */
	public OvhServerState[] serverState;

	/**
	 * Port attached to your server. Inherited from farm if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Status attached to your server
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackendCustomerServerStatusEnum status;

	/**
	 * Disabled if null. Send PROXY protocol header. Requires a compatible server.
	 *
	 * canBeNull && readOnly
	 */
	public OvhProxyProtocolVersionEnum proxyProtocolVersion;
}
