package net.minidev.ovh.api.dedicated.server.backup;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing quota associated to the current container
 */
public class OvhBackupQuota {
	/**
	 * Volume r/w bandwidth limit: read/write volume offered per month on the container.
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> maxBandwidth;

	/**
	 * Volume usage.
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> storageUsed;

	/**
	 * Container max size.
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> maxStorage;
}
