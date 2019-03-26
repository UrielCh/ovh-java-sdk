package net.minidev.ovh.api.overthebox;

import java.util.Date;

/**
 * Device
 */
public class OvhDevice {
	/**
	 * Network interfaces of the device
	 *
	 * canBeNull && readOnly
	 */
	public OvhDeviceInterface[] networkInterfaces;

	/**
	 * Last time the device has been seen on the provisionning servers
	 *
	 * canBeNull && readOnly
	 */
	public Date lastSeen;

	/**
	 * The public IP of the device
	 *
	 * canBeNull && readOnly
	 */
	public String publicIp;

	/**
	 * Version of the device
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * System version of the device
	 *
	 * canBeNull && readOnly
	 */
	public String systemVersion;

	/**
	 * The id of the device
	 *
	 * canBeNull && readOnly
	 */
	public String deviceId;

	/**
	 * Whether or not this device is associated to a service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean activated;
}
