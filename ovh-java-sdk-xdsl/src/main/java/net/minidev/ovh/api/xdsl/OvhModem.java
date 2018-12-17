package net.minidev.ovh.api.xdsl;

import java.util.Date;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhEasyFirewallLevelEnum;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhMTUSizeEnum;

/**
 * Modem
 */
public class OvhModem {
	/**
	 * Whether or not the modem is in bridge mode. To pass from bridge mode to routed mode, a reset is necessary. If the modem is managedByOvh, the bridge state will be kept after a reset
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isBridged;

	/**
	 * canBeNull && readOnly
	 */
	public String macAddress;

	/**
	 * canBeNull && readOnly
	 */
	public String brandName;

	/**
	 * canBeNull && readOnly
	 */
	public OvhModemCapabilities capabilities;

	/**
	 * Last time the modem made a CWMP request to the Auto Configuration Server
	 *
	 * canBeNull && readOnly
	 */
	public Date lastCwmpRequestDate;

	/**
	 * canBeNull && readOnly
	 */
	public String model;

	/**
	 * IP Address of the DMZ (To modify or delete the DMZ IP on the modem, a re-configuration of your modem has to be made, your configuration will be maintained, but you will lose your connection a few minutes)
	 *
	 * canBeNull && readOnly
	 */
	public String dmzIP;

	/**
	 * Whether or not the modem supports IPv6
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ipv6Support;

	/**
	 * Whether or not the user can configure his modem via OVH Interface (will lock telnet and local HTTP configuration page)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean managedByOvh;

	/**
	 * Size of the Maximum Transmission Unit on the modem's interfaces
	 *
	 * canBeNull && readOnly
	 */
	public OvhMTUSizeEnum mtuSize;

	/**
	 * Level of the FireWall on the modem
	 *
	 * canBeNull && readOnly
	 */
	public OvhEasyFirewallLevelEnum easyFirewallLevel;
}
