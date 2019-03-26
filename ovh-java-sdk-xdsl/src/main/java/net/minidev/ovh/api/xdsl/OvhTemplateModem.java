package net.minidev.ovh.api.xdsl;

import java.util.Date;
import net.minidev.ovh.api.xdsl.templatemodem.OvhDHCP;
import net.minidev.ovh.api.xdsl.templatemodem.OvhLAN;
import net.minidev.ovh.api.xdsl.templatemodem.OvhParametersToIgnore;
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
	 * Parameters capabilities. Lists what can be applied from this template
	 *
	 * canBeNull && readOnly
	 */
	public String capabilities;

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
	 * Template creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Do not apply these parameters from template. You can use parametersCapabilities to know availability
	 *
	 * canBeNull && readOnly
	 */
	public OvhParametersToIgnore parametersToIgnore;

	/**
	 * IP Address of the DMZ
	 *
	 * canBeNull && readOnly
	 */
	public String dmzIP;

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
