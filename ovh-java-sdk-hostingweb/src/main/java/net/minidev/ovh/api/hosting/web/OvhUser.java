package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.user.OvhServiceCredentials;
import net.minidev.ovh.api.hosting.web.user.OvhSshStateEnum;
import net.minidev.ovh.api.hosting.web.user.OvhStateEnum;
import net.minidev.ovh.api.hosting.web.user.OvhStatusEnum;

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
	 * Credentials to manage your webhosting
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceCredentials serviceManagementCredentials;

	/**
	 * User ssh status
	 *
	 * canBeNull && readOnly
	 */
	public OvhSshStateEnum sshState;

	/**
	 * User state
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
	 * The task ID working on this user
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Home directory
	 *
	 * canBeNull && readOnly
	 */
	public String home;

	/**
	 * The user status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
