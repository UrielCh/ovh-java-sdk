package net.minidev.ovh.api.order.catalog.pcc;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Describes a Private Cloud Host Network
 */
public class OvhHostNetworkSpecifications {
	/**
	 * Number of network interfaces
	 *
	 * canBeNull && readOnly
	 */
	public Long nics;

	/**
	 * Speed of the network interfaces
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> speed;
}
