package net.minidev.ovh.api.iploadbalancing;

/**
 * Probe used to determine if a backend is alive and can handle requests
 */
public class OvhBackendProbe {
	/**
	 * Port used to probe your backend. Equal to farm port if null. Ignored for oco probe type
	 *
	 * canBeNull
	 */
	public Long port;

	/**
	 * Probe type. "tcp" if null
	 *
	 * canBeNull
	 */
	public OvhProbeTypeEnum type;
}
