package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing traffic informations about this dedicated server
 */
public class OvhTrafficDetails {
	/**
	 * Monthly input traffic quota allowed
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> inputQuotaSize;

	/**
	 * Monthly output traffic quota allowed
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> outputQuotaSize;

	/**
	 * Monthly input traffic consumed this month
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> inputQuotaUsed;

	/**
	 * Monthly output traffic consumed this month
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> outputQuotaUsed;
}
