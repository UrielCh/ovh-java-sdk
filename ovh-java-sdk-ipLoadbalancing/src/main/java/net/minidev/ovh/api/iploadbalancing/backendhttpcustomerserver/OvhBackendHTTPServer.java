package net.minidev.ovh.api.iploadbalancing.backendhttpcustomerserver;

import net.minidev.ovh.api.iploadbalancing.OvhBackendCustomerServerStatusEnum;
import net.minidev.ovh.api.iploadbalancing.OvhProxyProtocolVersionEnum;
import net.minidev.ovh.api.iploadbalancing.OvhServerState;

/**
 * HTTP Farm's Server
 */
public class OvhBackendHTTPServer {
	/**
	 * Certificate chain. Allow server certificate verification (Avoid man-in-the-middle attacks)
	 *
	 * canBeNull && readOnly
	 */
	public String chain;

	/**
	 * Backup state. Default: 'false'
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
	 * Server cookie value configured for cookie stickiness
	 *
	 * canBeNull && readOnly
	 */
	public String cookie;

	/**
	 * Human readable name for your server, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Weight value. Defaults to 1. 0 if not used in load balancing. Servers with higher weight get more requests.
	 *
	 * canBeNull && readOnly
	 */
	public Long weight;

	/**
	 * farm id
	 *
	 * canBeNull && readOnly
	 */
	public Long backendId;

	/**
	 * SSL ciphering. Probes will also be sent ciphered. Default: 'false'
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
	 * Probe state. Default: 'false'
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
