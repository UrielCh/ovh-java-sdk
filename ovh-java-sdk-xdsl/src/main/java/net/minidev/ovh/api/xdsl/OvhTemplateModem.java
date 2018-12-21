package net.minidev.ovh.api.xdsl;

import java.util.Date;
import net.minidev.ovh.api.xdsl.templatemodem.OvhDHCP;
import net.minidev.ovh.api.xdsl.templatemodem.OvhLAN;
import net.minidev.ovh.api.xdsl.templatemodem.OvhPortMapping;
import net.minidev.ovh.api.xdsl.templatemodem.OvhWLAN;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhMTUSizeEnum;

/**
 * Modem Template
 */
public class OvhTemplateModem {
	/**
	 * List of PortMapping for this template
	 *
	 * canBeNull && readOnly
	 */
	public OvhPortMapping[] portMapping;

	/**
	 * Name of the Modem Template
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * List of LAN for this template
	 *
	 * canBeNull && readOnly
	 */
	public OvhLAN[] LAN;

	/**
	 * List of WLAN for this template
	 *
	 * canBeNull && readOnly
	 */
	public OvhWLAN[] WLAN;

	/**
	 * IP Address of the DMZ
	 *
	 * canBeNull && readOnly
	 */
	public String dmzIP;

	/**
	 * Template creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * List of DHCP for this template
	 *
	 * canBeNull && readOnly
	 */
	public OvhDHCP[] DHCP;

	/**
	 * Size of the Maximum Transmission Unit on the modem's interfaces
	 *
	 * canBeNull && readOnly
	 */
	public OvhMTUSizeEnum mtuSize;
}
