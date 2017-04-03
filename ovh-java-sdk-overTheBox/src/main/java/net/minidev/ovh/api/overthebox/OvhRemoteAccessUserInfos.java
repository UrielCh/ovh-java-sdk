package net.minidev.ovh.api.overthebox;

/**
 * Infos about the remote user
 */
public class OvhRemoteAccessUserInfos {
	/**
	 * IP from which the remote access will be allowed
	 *
	 * canBeNull
	 */
	public String ip;

	/**
	 * The public key authorized on the device (for SSH purpose)
	 *
	 * canBeNull
	 */
	public String publicKey;

	/**
	 * The user that will access the device remotely
	 *
	 * canBeNull
	 */
	public String user;
}
