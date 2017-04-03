package net.minidev.ovh.api.iploadbalancing.backendhttp;

import net.minidev.ovh.api.iploadbalancing.OvhBackendProbe;
import net.minidev.ovh.api.iploadbalancing.OvhBalanceHTTPEnum;
import net.minidev.ovh.api.iploadbalancing.OvhStickinessHTTPEnum;

/**
 * HTTP Farm
 */
public class OvhBackendHttp {
	/**
	 * Load balancing algorithm. 'roundrobin' if null
	 *
	 * canBeNull && readOnly
	 */
	public OvhBalanceHTTPEnum balance;

	/**
	 * Zone of you farm
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Port attached to your farm. Inherited from frontend if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Stickiness type. No stickiness if null
	 *
	 * canBeNull && readOnly
	 */
	public OvhStickinessHTTPEnum stickiness;

	/**
	 * Id of your farm
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Probe used to determine if a backend is alive and can handle requests. Defaults to tcp on the same port as the farm
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackendProbe probe;
}
