package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.dedicated.OvhDatacenterEnum;

/**
 * Server informations
 */
public class OvhDedicated {
	/**
	 * canBeNull && readOnly
	 */
	public String rack;

	/**
	 * Operating system
	 *
	 * canBeNull && readOnly
	 */
	public String os;

	/**
	 * canBeNull && readOnly
	 */
	public Long bootId;

	/**
	 * dedicated server ip
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * canBeNull && readOnly
	 */
	public Long linkSpeed;

	/**
	 * dedicated datacenter localisation
	 *
	 * canBeNull && readOnly
	 */
	public OvhDatacenterEnum datacenter;

	/**
	 * Dedicated server support level
	 *
	 * canBeNull && readOnly
	 */
	public OvhSupportLevelEnum supportLevel;

	/**
	 * dedicated server reverse
	 *
	 * canBeNull && readOnly
	 */
	public String reverse;

	/**
	 * Icmp monitoring state
	 *
	 * canBeNull && readOnly
	 */
	public Boolean monitoring;

	/**
	 * your server id
	 *
	 * canBeNull && readOnly
	 */
	public Long serverId;

	/**
	 * canBeNull && readOnly
	 */
	public String rescueMail;

	/**
	 * dedicated server name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public String rootDevice;

	/**
	 * Does this server have professional use option
	 *
	 * canBeNull && readOnly
	 */
	public Boolean professionalUse;

	/**
	 * dedicater server commercial range
	 *
	 * canBeNull && readOnly
	 */
	public String commercialRange;
}
