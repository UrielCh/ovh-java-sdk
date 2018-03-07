package net.minidev.ovh.api.overthebox;

import java.util.Date;

/**
 * Device
 */
public class OvhDevice {
	/**
	 * Last time the device has been seen on the provisionning servers
	 *
	 * canBeNull && readOnly
	 */
	public Date lastSeen;

	/**
	 * Network interfaces of the device
	 *
	 * canBeNull && readOnly
	 */
	public OvhDeviceInterface[] networkInterfaces;

	/**
	 * The public IP of the device
	 *
	 * canBeNull && readOnly
	 */
	public String publicIp;

	/**
	 * The id of the device
	 *
	 * canBeNull && readOnly
	 */
	public String deviceId;

	/**
	 * System version of the device
	 *
	 * canBeNull && readOnly
	 */
	public String systemVersion;

	/**
	 * Version of the device
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * Whether or not this device is associated to a service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean activated;
}
