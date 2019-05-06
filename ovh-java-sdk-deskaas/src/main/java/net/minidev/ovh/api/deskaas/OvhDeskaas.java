package net.minidev.ovh.api.deskaas;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Desktop As A Service
 */
public class OvhDeskaas {
	/**
	 * Reference of Virtual Desktop
	 *
	 * canBeNull && readOnly
	 */
	public String reference;

	/**
	 * Operating system of desktop
	 *
	 * canBeNull && readOnly
	 */
	public String os;

	/**
	 * Vcpu allocated to desktop
	 *
	 * canBeNull && readOnly
	 */
	public Long vcpu;

	/**
	 * Outgoing ip
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Alias determined by the use
	 *
	 * canBeNull && readOnly
	 */
	public String alias;

	/**
	 * Current state of your Virtual Desktop
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Service name of your Desktop As A Service
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Data allocated to desktop
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> dataDisk;

	/**
	 * URL to connect to the virtualDesktop
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * Profile of Virtual Desktop
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * RAM allocated to desktop
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> ram;
}
