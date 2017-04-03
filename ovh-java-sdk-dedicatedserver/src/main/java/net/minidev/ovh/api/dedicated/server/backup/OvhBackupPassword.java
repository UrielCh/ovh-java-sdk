package net.minidev.ovh.api.dedicated.server.backup;

/**
 * A structure describing regenerated passwords
 */
public class OvhBackupPassword {
	/**
	 * Password to reach the storage container through the sftp gw.
	 *
	 * canBeNull
	 */
	public String sftpStorage;

	/**
	 * Password to reach the archive container through the sftp gw.
	 *
	 * canBeNull
	 */
	public String sftpArchive;

	/**
	 * Password to reach the archive container through swift.
	 *
	 * canBeNull
	 */
	public String swiftArchive;

	/**
	 * Password to reach the storage container through swift.
	 *
	 * canBeNull
	 */
	public String swiftStorage;
}
