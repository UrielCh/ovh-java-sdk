package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.dedicatedcloud.backup.OvhBackupTypeEnum;

/**
 * Private Cloud Restore Point
 */
public class OvhRestorePoint {
	/**
	 * Size of the restore point
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> restorePointSize;

	/**
	 * Creation time of the restore point
	 *
	 * canBeNull && readOnly
	 */
	public String creationTime;

	/**
	 * Show if the restore point is corrupted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isCorrupted;

	/**
	 * Type of the restore point
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackupTypeEnum type;

	/**
	 * Id of the restore point.
	 *
	 * canBeNull && readOnly
	 */
	public Long restorePointId;
}
