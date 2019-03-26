package net.minidev.ovh.api.order.catalog._public;

import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlob;

/**
 * Describes a Dedicated Server Product
 */
public class OvhDedicatedServerProduct {
	/**
	 * Additional information for this Product
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlob blobs;

	/**
	 * Identifier of the Product
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Description of the Product
	 *
	 * canBeNull && readOnly
	 */
	public String description;
}
