package net.minidev.ovh.api.vps.veeam;

/**
 * A structure describing a Veeam backup's access informations
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
}
