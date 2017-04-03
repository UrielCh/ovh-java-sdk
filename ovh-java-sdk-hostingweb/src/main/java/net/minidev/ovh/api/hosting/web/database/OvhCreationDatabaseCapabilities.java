package net.minidev.ovh.api.hosting.web.database;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Struct which describs quota and available for a specific type of database
 */
public class OvhCreationDatabaseCapabilities {
	/**
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> quota;

	/**
	 * Number of database left for creation
	 *
	 * canBeNull
	 */
	public Long available;

	/**
	 * canBeNull
	 */
	public OvhDatabaseCapabilitiesTypeEnum type;
}
