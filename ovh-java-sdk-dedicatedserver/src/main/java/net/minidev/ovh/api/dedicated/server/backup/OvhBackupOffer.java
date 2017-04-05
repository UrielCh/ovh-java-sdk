package net.minidev.ovh.api.dedicated.server.backup;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Backup cloud offer description for a dedicated server
 */
public class OvhBackupOffer {
	/**
	 * Storage volume r/w bandwidth limit: read/write volume offered per month on the container.
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> maxBandwidthStorage;

	/**
	 * Storage container max size.
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> maxStorage;

	/**
	 * Archive volume r/w bandwidth limit: read/write volume offered per month on the container.
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> maxBandwidthArchive;

	/**
	 * Archive container max size.
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> maxArchive;
}
