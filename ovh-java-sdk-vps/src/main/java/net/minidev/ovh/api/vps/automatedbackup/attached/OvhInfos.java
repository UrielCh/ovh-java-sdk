package net.minidev.ovh.api.vps.automatedbackup.attached;

/**
 * A structure describing a backup's access informations
 */
public class OvhInfos {
	/**
	 * SMB URL of the backup
	 *
	 * canBeNull
	 */
	public String smb;

	/**
	 * NFS URL of the backup
	 *
	 * canBeNull
	 */
	public String nfs;

	/**
	 * Additional Disk details
	 *
	 * canBeNull
	 */
	public String additionalDisk;
}
