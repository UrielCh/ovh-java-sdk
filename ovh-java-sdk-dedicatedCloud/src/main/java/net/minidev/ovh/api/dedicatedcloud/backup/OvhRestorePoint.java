package net.minidev.ovh.api.dedicatedcloud.backup;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Details about a restore point
 */
public class OvhRestorePoint {
	/**
	 * Size of the restore point
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> size;

	/**
	 * Creation time of the restore point
	 *
	 * canBeNull
	 */
	public Date creationTime;

	/**
	 * Show if the restore point is corrupted
	 *
	 * canBeNull
	 */
	public Boolean isCorrupted;

	/**
	 * Type of the restore point
	 *
	 * canBeNull
	 */
	public OvhBackupTypeEnum type;

	/**
	 * Id of the restore point
	 *
	 * canBeNull
	 */
	public Long restorePointId;
}
