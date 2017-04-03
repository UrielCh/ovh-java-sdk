package net.minidev.ovh.api.overthebox;

/**
 * All the infos needed to connect yourself to your OTB
 */
public class OvhRemoteAccessConnectionInfos {
	/**
	 * Port to connect to when accessing the device remotely
	 *
	 * canBeNull
	 */
	public Long port;

	/**
	 * IP to connect to when accessing the device remotely
	 *
	 * canBeNull
	 */
	public String ip;
}
