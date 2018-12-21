package net.minidev.ovh.api.xdsl.templatemodem;

import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhAddressingTypeEnum;

/**
 * LAN Configuration for Modem Template
 */
public class OvhLAN {
	/**
	 * How the LAN interface of the modem is getting its address
	 *
	 * canBeNull
	 */
	public OvhAddressingTypeEnum addressingType;

	/**
	 * The subnet mask of the LAN interface of the modem
	 *
	 * canBeNull
	 */
	public String subnetMask;

	/**
	 * The IP address of the LAN interface of the modem
	 *
	 * canBeNull
	 */
	public String IPAddress;

	/**
	 * Name of the LAN
	 *
	 * canBeNull
	 */
	public String lanName;
}
