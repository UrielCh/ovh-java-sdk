package net.minidev.ovh.api.xdsl;

import java.util.Date;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhConnectedDeviceAddressSourceEnum;

/**
 * Connected Device
 */
public class OvhConnectedDevice {
	/**
	 * On which interface is connected the device
	 *
	 * canBeNull && readOnly
	 */
	public String interfaceType;

	/**
	 * Host name given by the device to the modem
	 *
	 * canBeNull && readOnly
	 */
	public String hostName;

	/**
	 * MAC address of the device
	 *
	 * canBeNull && readOnly
	 */
	public String macAddress;

	/**
	 * How did the device got its IP address
	 *
	 * canBeNull && readOnly
	 */
	public OvhConnectedDeviceAddressSourceEnum addressSource;

	/**
	 * The IP address of the device
	 *
	 * canBeNull && readOnly
	 */
	public String ipAddress;

	/**
	 * The state of this device on the modem
	 *
	 * canBeNull && readOnly
	 */
	public Boolean active;

	/**
	 * The remaining time in seconds of the DHCP lease of this device (-1 means infinite)
	 *
	 * canBeNull && readOnly
	 */
	public Long leaseTimeRemaining;

	/**
	 * The date time of the last update of thoses informations
	 *
	 * canBeNull && readOnly
	 */
	public Date informationDate;
}
