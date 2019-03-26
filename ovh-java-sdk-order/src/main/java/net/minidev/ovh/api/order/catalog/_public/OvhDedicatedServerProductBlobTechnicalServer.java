package net.minidev.ovh.api.order.catalog._public;

import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalCPU;
import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalFrame;

/**
 * Describes some technicals informations of a Dedicated Server
 */
public class OvhDedicatedServerProductBlobTechnicalServer {
	/**
	 * CPU properties
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalCPU cpu;

	/**
	 * Dedicated server series
	 *
	 * canBeNull && readOnly
	 */
	public String range;

	/**
	 * Frame properties
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalFrame frame;
}
