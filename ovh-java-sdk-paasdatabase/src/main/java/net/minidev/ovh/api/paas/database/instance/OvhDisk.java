package net.minidev.ovh.api.paas.database.instance;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Disk Container
 */
public class OvhDisk {
	/**
	 * Max space disk
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> size;

	/**
	 * Used space disk
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> used;
}
