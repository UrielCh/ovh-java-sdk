package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A timestamp associated to a value
 */
public class OvhMrtgTimestampValue {
	/**
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> value;

	/**
	 * canBeNull
	 */
	public Long timestamp;
}
