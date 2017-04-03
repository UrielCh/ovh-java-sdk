package net.minidev.ovh.api.dedicated.server;

import java.util.Date;

/**
 * Intervention made on this server
 */
public class OvhIntervention {
	/**
	 * the intervention start date
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * the intervention type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * The intervention id
	 *
	 * canBeNull && readOnly
	 */
	public Long interventionId;
}
