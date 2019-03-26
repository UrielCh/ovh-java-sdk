package net.minidev.ovh.api.order.catalog._public;

/**
 * Describes a Network technical Blob for a Dedicated Server
 */
public class OvhDedicatedServerProductBlobTechnicalNetwork {
	/**
	 * Network level
	 *
	 * canBeNull && readOnly
	 */
	public Long level;

	/**
	 * Network limit
	 *
	 * canBeNull && readOnly
	 */
	public Long limit;

	/**
	 * Guaranteed Network
	 *
	 * canBeNull && readOnly
	 */
	public Boolean guaranteed;

	/**
	 * Network burst
	 *
	 * canBeNull && readOnly
	 */
	public Long burst;
}
