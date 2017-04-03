package net.minidev.ovh.api.overthebox;

import java.util.Date;

/**
 * A device for registration
 */
public class OvhDeviceForRegistration {
	/**
	 * The last time this device was seen on the provisionning servers
	 *
	 * canBeNull
	 */
	public Date lastSeen;

	/**
	 * canBeNull
	 */
	public String deviceId;

	/**
	 * Whether or not this device is actived
	 *
	 * canBeNull
	 */
	public Boolean activated;
}
