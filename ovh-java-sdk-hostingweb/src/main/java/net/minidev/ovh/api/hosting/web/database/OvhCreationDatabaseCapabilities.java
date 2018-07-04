package net.minidev.ovh.api.hosting.web.database;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Struct which describs quota and available for a specific type of database
 */
public class OvhCreationDatabaseCapabilities {
	/**
	 * Database software available on this platform
	 *
	 * canBeNull
	 */
	public OvhDatabaseTypeEnum[] engines;

	/**
	 * Size of data can be used
	 *
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
	 * Technology use to isolate differents webhosting accounts
	 *
	 * canBeNull
	 */
	public OvhDatabaseIsolationEnum isolation;

	/**
	 * Database offer name
	 *
	 * canBeNull
	 */
	public OvhDatabaseCapabilitiesTypeEnum type;
}
