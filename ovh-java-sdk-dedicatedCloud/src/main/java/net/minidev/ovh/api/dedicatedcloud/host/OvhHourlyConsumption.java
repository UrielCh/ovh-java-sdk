package net.minidev.ovh.api.dedicatedcloud.host;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Hourly consumption of a host
 */
public class OvhHourlyConsumption {
	/**
	 * Last update.
	 *
	 * canBeNull
	 */
	public Date lastUpdate;

	/**
	 * Consumption of the Host.
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> consumption;
}
