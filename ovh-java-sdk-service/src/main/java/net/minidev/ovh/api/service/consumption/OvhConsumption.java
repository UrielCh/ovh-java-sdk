package net.minidev.ovh.api.service.consumption;

import net.minidev.ovh.api.complextype.OvhSafeKeyValue;

/**
 * Resource description and quantity
 */
public class OvhConsumption {
	/**
	 * Metadata to help to identify the resource
	 *
	 * canBeNull && readOnly
	 */
	public OvhSafeKeyValue<String>[] metadata;

	/**
	 * Quantity of resource recorded
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Id unique if any specified
	 *
	 * canBeNull && readOnly
	 */
	public String uniqueId;

	/**
	 * Order plan code of the resource
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;
}
