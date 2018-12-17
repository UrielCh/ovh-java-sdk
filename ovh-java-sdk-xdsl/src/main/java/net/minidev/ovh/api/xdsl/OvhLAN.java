package net.minidev.ovh.api.xdsl;

import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhAddressingTypeEnum;

/**
 * LAN Configuration of the Modem
 */
public class OvhLAN {
	/**
	 * How the LAN interface of the modem is gettig its address
	 *
	 * canBeNull && readOnly
	 */
	public OvhAddressingTypeEnum addressingType;

	/**
	 * The IP address of the LAN interface of the modem
	 *
	 * canBeNull && readOnly
	 */
	public String IPAddress;

	/**
	 * The subnet mask of the LAN interface of the modem
	 *
	 * canBeNull && readOnly
	 */
	public String subnetMask;

	/**
	 * Name of the LAN
	 *
	 * canBeNull && readOnly
	 */
	public String lanName;

	/**
	 * ID of the ongoing todo (NULL if none)
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;
}
