package net.minidev.ovh.api.vps.veeam;

/**
 * Currently restored backup
 */
public class OvhRestoredBackup {
	/**
	 * The restored backup state
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * The restore point id
	 *
	 * canBeNull && readOnly
	 */
	public Long restorePointId;

	/**
	 * Backup access informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhInfos accessInfos;
}
