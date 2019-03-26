package net.minidev.ovh.api.order.catalog._public;

import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalCPU;
import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalGPU;
import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalMemory;
import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalNetwork;
import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalServer;
import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalStorage;

/**
 * Describes a Technical Blob for a Dedicated Server
 */
public class OvhDedicatedServerProductBlobTechnical {
	/**
	 * Hardware informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalServer server;

	/**
	 * Memory informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalMemory memory;

	/**
	 * Network informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalNetwork bandwidth;

	/**
	 * CPU informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalCPU cpu;

	/**
	 * vRack informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalNetwork vrack;

	/**
	 * Disks informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalStorage storage;

	/**
	 * GPU informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalGPU gpu;
}
