package net.minidev.ovh.api.dedicated.virtualnetworkinterface;

/**
 * Your VirtualNetworkInterface
 */
public class OvhVirtualNetworkInterface {
	/**
	 * VirtualNetworkInterface mode
	 *
	 * canBeNull && readOnly
	 */
	public OvhVirtualNetworkInterfaceModeEnum mode;

	/**
	 * User defined VirtualNetworkInterface name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Server bound to this VirtualNetworkInterface
	 *
	 * canBeNull && readOnly
	 */
	public String serverName;

	/**
	 * vRack name
	 *
	 * canBeNull && readOnly
	 */
	public String vrack;

	/**
	 * VirtualNetworkInterface unique id
	 *
	 * canBeNull && readOnly
	 */
	public String uuid;
}
