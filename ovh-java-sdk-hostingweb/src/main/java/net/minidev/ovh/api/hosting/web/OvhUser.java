package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.user.OvhSshStateEnum;
import net.minidev.ovh.api.hosting.web.user.OvhStateEnum;

/**
 * Hosting users
 */
public class OvhUser {
	/**
	 * Is this user primary
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isPrimaryAccount;

	/**
	 * User ssh status
	 *
	 * canBeNull && readOnly
	 */
	public OvhSshStateEnum sshState;

	/**
	 * User status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Login used to connect on FTP and SSH
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Home directory
	 *
	 * canBeNull && readOnly
	 */
	public String home;
}
