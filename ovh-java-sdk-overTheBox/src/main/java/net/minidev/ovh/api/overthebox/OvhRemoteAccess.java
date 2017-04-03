package net.minidev.ovh.api.overthebox;

import java.util.Date;

/**
 * If authorized, a remote access will expose a port, allowing an access to the device remotely
 */
public class OvhRemoteAccess {
	/**
	 * All the infos needed to connect yourself to your OTB
	 *
	 * canBeNull && readOnly
	 */
	public OvhRemoteAccessConnectionInfos connectionInfos;

	/**
	 * Infos about the remote user
	 *
	 * canBeNull && readOnly
	 */
	public OvhRemoteAccessUserInfos remoteUserInfos;

	/**
	 * The user that authorized the remote access
	 *
	 * canBeNull && readOnly
	 */
	public String authorizedBy;

	/**
	 * The device's port which will be exposed
	 *
	 * canBeNull && readOnly
	 */
	public Long exposedPort;

	/**
	 * The id of the remote access
	 *
	 * canBeNull && readOnly
	 */
	public String remoteAccessId;

	/**
	 * If the remote access was accepted by the remote user
	 *
	 * canBeNull && readOnly
	 */
	public Boolean accepted;

	/**
	 * The date of the remote access demand
	 *
	 * canBeNull && readOnly
	 */
	public Date askDate;

	/**
	 * Status of the remote access
	 *
	 * canBeNull && readOnly
	 */
	public OvhRemoteAccessStatusEnum status;

	/**
	 * When the remote access will be automatically deleted
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
