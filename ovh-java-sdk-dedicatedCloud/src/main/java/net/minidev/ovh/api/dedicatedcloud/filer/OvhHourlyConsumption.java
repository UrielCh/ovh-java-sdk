package net.minidev.ovh.api.dedicatedcloud.filer;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Hourly consumption of a filer
 */
public class OvhHourlyConsumption {
	/**
	 * Last update
	 *
	 * canBeNull
	 */
	public Date lastUpdate;

	/**
	 * Consumption of the Filer
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> consumption;
}
