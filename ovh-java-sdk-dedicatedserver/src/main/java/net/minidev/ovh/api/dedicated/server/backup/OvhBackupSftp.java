package net.minidev.ovh.api.dedicated.server.backup;

/**
 * A structure describing the SFTP access to a container
 */
public class OvhBackupSftp {
	/**
	 * Sftp password.
	 *
	 * canBeNull
	 */
	public String password;

	/**
	 * Url
	 *
	 * canBeNull
	 */
	public String url;

	/**
	 * Username
	 *
	 * canBeNull
	 */
	public String username;
}
