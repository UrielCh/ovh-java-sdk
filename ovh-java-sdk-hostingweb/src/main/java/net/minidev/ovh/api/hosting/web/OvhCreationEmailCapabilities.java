package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Struct which describes mail offer available and his quota
 */
public class OvhCreationEmailCapabilities {
	/**
	 * Email account capacity
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> quota;

	/**
	 * Number of email available for creation
	 *
	 * canBeNull
	 */
	public Long available;
}
