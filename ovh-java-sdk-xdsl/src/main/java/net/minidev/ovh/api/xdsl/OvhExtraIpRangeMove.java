package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Informations about the extra IP range during address move
 */
public class OvhExtraIpRangeMove {
	/**
	 * Date of the migration
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * IP range to migrate
	 *
	 * canBeNull
	 */
	public String ipRange;

	/**
	 * Access where the IP range will be moved to
	 *
	 * canBeNull
	 */
	public String moveTo;
}
