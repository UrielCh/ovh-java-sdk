package net.minidev.ovh.api.dedicatedcloud.host;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A Host profile
 */
public class OvhProfile {
	/**
	 * canBeNull
	 */
	public String core;

	/**
	 * canBeNull
	 */
	public String name;

	/**
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> cpu;

	/**
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> ram;
}
