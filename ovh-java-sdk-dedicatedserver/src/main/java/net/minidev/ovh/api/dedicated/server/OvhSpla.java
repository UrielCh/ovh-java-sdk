package net.minidev.ovh.api.dedicated.server;

import java.util.Date;

/**
 * SPLA licenses management
 */
public class OvhSpla {
	/**
	 * License serial number
	 *
	 * canBeNull && readOnly
	 */
	public String serialNumber;

	/**
	 * Last update timestamp
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * License id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * License type
	 *
	 * canBeNull && readOnly
	 */
	public OvhSplaTypeEnum type;

	/**
	 * Status of license
	 *
	 * canBeNull && readOnly
	 */
	public OvhSplaStatusEnum status;
}
