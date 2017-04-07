package net.minidev.ovh.api.iploadbalancing.backendcustomerserver;

import net.minidev.ovh.api.iploadbalancing.OvhProxyProtocolVersionEnum;

/**
 * BackendServer
 */
public class OvhBackendServer {
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
	 * Server cookie value configured for cookie stickiness
	 *
	 * canBeNull && readOnly
	 */
	public String cookie;

	/**
	 * Port attached to your server. Inherited from backend if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Backend id
	 *
	 * canBeNull && readOnly
	 */
	public Long backendId;

	/**
	 * Weight value (0 if null)
	 *
	 * canBeNull && readOnly
	 */
	public Long weight;

	/**
	 * Id of your backend/server link
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
	 * Server id
	 *
	 * canBeNull && readOnly
	 */
	public Long serverId;

	/**
	 * Enforce use of the PROXY protocol version over any connection established to this server (disabled if null)
	 *
	 * canBeNull && readOnly
	 */
	public OvhProxyProtocolVersionEnum proxyProtocolVersion;

	/**
	 * Probe state
	 *
	 * canBeNull && readOnly
	 */
	public Boolean probe;
}
