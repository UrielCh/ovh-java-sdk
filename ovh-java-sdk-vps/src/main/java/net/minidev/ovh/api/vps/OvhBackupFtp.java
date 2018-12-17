package net.minidev.ovh.api.vps;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Backup Ftp assigned to this VPS
 */
public class OvhBackupFtp {
	/**
	 * If not-null, gives the date since when your account was set in read-only mode because the quota was exceeded
	 *
	 * canBeNull && readOnly
	 */
	public Date readOnlyDate;

	/**
	 * The disk space currently used on your backup FTP
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> usage;

	/**
	 * The disk space available on your backup FTP
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> quota;

	/**
	 * The backup FTP server name
	 *
	 * canBeNull && readOnly
	 */
	public String ftpBackupName;

	/**
	 * The backup FTP type
	 *
	 * canBeNull && readOnly
	 */
	public String type;
}
