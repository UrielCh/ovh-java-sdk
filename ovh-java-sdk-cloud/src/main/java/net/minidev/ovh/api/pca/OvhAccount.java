package net.minidev.ovh.api.pca;

/**
 * Cloud Archives Account
 */
public class OvhAccount {
	/**
	 * encrypted password
	 *
	 * canBeNull && readOnly
	 */
	public String password;

	/**
	 * ssh key to be used for upload and download
	 *
	 * canBeNull && readOnly
	 */
	public String sshkey;

	/**
	 * account domain
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * host where to upload files to
	 *
	 * canBeNull && readOnly
	 */
	public String host;

	/**
	 * login for cloud archives
	 *
	 * canBeNull && readOnly
	 */
	public String login;
}
