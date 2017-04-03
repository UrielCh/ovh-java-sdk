package net.minidev.ovh.api.iploadbalancing.backendtcpcustomerserver;

import net.minidev.ovh.api.iploadbalancing.OvhBackendCustomerServerStatusEnum;
import net.minidev.ovh.api.iploadbalancing.OvhProxyProtocolVersionEnum;

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
	 * Port attached to your server. Inherited from farm if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Farm id
	 *
	 * canBeNull && readOnly
	 */
	public Long backendId;

	/**
	 * Weight value (1 if null)
	 *
	 * canBeNull && readOnly
	 */
	public Long weight;

	/**
	 * Id of your server
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * SSL ciphering. Probes will also be sent ciphered
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ssl;

	/**
	 * Status attached to your server
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackendCustomerServerStatusEnum status;

	/**
	 * Enforce use of the PROXY protocol version over any connection established to this server (disabled if null)
	 *
	 * canBeNull && readOnly
	 */
	public OvhProxyProtocolVersionEnum proxyProtocolVersion;

	/**
	 * Probe state. 'False' if null
	 *
	 * canBeNull && readOnly
	 */
	public Boolean probe;
}
