package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations bandwidth orderable for this dedicated server
 */
public class OvhBandwidthvRackOrderable {
	/**
	 * Is bandwidth orderable for this server
	 *
	 * canBeNull
	 */
	public Boolean orderable;

	/**
	 * vRack Bandwidth orderable in mbps
	 *
	 * canBeNull
	 */
	public OvhBandwidthvRackOrderEnum[] vrack;
}
