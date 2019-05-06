package net.minidev.ovh.api.order.catalog._public;

import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalCPU;
import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalFrame;

/**
 * Describes some technicals informations of a Dedicated Server
 */
public class OvhDedicatedServerProductBlobTechnicalServer {
	/**
	 * Dedicated server series
	 *
	 * canBeNull && readOnly
	 */
	public String range;

	/**
	 * CPU properties
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalCPU cpu;

	/**
	 * Frame properties
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalFrame frame;
}
