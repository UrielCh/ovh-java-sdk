package net.minidev.ovh.api.dedicatedcloud;

/**
 * A structure describing the network of a the virtual machine
 */
public class OvhVmNetwork {
	/**
	 * canBeNull
	 */
	public Boolean connected;

	/**
	 * canBeNull
	 */
	public String macAddress;

	/**
	 * canBeNull
	 */
	public OvhVmNetworkBacking backing;

	/**
	 * canBeNull
	 */
	public String controler;

	/**
	 * canBeNull
	 */
	public Boolean allowGuestControl;

	/**
	 * canBeNull
	 */
	public String label;

	/**
	 * canBeNull
	 */
	public Boolean startConnected;

	/**
	 * canBeNull
	 */
	public OvhVirtualDeviceConnectInfoStatus status;
}
