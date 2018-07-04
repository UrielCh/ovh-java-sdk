package net.minidev.ovh.api.order.catalog.pcc;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Describes a Private Cloud Storage
 */
public class OvhStorageSpecifications {
	/**
	 * Size of the storage
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> size;

	/**
	 * Type of the storage
	 *
	 * canBeNull && readOnly
	 */
	public String type;
}
