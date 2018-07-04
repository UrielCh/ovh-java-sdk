package net.minidev.ovh.api.order.catalog.pcc;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Describes a Private Cloud Host Memory
 */
public class OvhHostMemorySpecifications {
	/**
	 * Memory Size
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> ram;
}
