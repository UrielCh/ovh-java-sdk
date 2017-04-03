package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations bandwidth orderable for this dedicated server
 */
public class OvhBandwidthOrderable {
	/**
	 * Bandwidth "platinum" orderable in mbps
	 *
	 * canBeNull
	 */
	public OvhBandwidthOrderEnum[] platinum;

	/**
	 * Bandwidth "premium" orderable in mbps
	 *
	 * canBeNull
	 */
	public OvhBandwidthOrderEnum[] premium;

	/**
	 * Bandwidth "ultimate" orderable in mbps
	 *
	 * canBeNull
	 */
	public OvhBandwidthOrderEnum[] ultimate;

	/**
	 * Is bandwidth orderable for this server
	 *
	 * canBeNull
	 */
	public Boolean orderable;
}
