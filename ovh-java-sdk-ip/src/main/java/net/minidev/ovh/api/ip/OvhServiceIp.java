package net.minidev.ovh.api.ip;

import net.minidev.ovh.api.coretypes.OvhCountryEnum;

/**
 * Your IP linked to service
 */
public class OvhServiceIp {
	/**
	 * canBeNull && readOnly
	 */
	public Boolean canBeTerminated;

	/**
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum country;

	/**
	 * IP block organisation Id
	 *
	 * canBeNull && readOnly
	 */
	public String organisationId;

	/**
	 * Routage information
	 *
	 * canBeNull && readOnly
	 */
	public OvhRoutedTo routedTo;

	/**
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Custom description on your ip
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public OvhIpTypeEnum type;
}
