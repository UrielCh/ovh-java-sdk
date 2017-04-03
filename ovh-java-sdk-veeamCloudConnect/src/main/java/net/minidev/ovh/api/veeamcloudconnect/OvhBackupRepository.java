package net.minidev.ovh.api.veeamcloudconnect;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Veeam Backup Repository
 */
public class OvhBackupRepository {
	/**
	 * The quota used on this Backup repository
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> quotaUsed;

	/**
	 * The quota allowed on this Backup repository
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> quota;

	/**
	 * The inventory name of your backup repository
	 *
	 * canBeNull && readOnly
	 */
	public String inventoryName;

	/**
	 * The state of your backup repository
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackupRepositoryStateEnum state;
}
