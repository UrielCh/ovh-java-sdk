package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Describe statistics information of a Modem
 */
public class OvhStatsModemInfo {
	/**
	 * Downstream margin
	 *
	 * canBeNull
	 */
	public Double downstreamMargin;

	/**
	 * Line modulation used
	 *
	 * canBeNull
	 */
	public String modulation;

	/**
	 * Upstream attenuation
	 *
	 * canBeNull
	 */
	public Double upstreamAttenuation;

	/**
	 * Connection uptime
	 *
	 * canBeNull
	 */
	public Long connectionUptime;

	/**
	 * Downstream synchronization
	 *
	 * canBeNull
	 */
	public Double downstreamSync;

	/**
	 * Synchronization uptime
	 *
	 * canBeNull
	 */
	public Long syncUptime;

	/**
	 * Downstream attenuation
	 *
	 * canBeNull
	 */
	public Double downstreamAttenuation;

	/**
	 * Upstream synchronization
	 *
	 * canBeNull
	 */
	public Double upstreamSync;

	/**
	 * Upstream margin
	 *
	 * canBeNull
	 */
	public Double upstreamMargin;

	/**
	 * Count from last refresh in seconds
	 *
	 * canBeNull
	 */
	public Long quarterHourStart;

	/**
	 * Time of last refresh
	 *
	 * canBeNull
	 */
	public Date lastUpdate;

	/**
	 * Amount of CRC error detected
	 *
	 * canBeNull
	 */
	public Long crcError;

	/**
	 * Modem uptime
	 *
	 * canBeNull
	 */
	public Long deviceUptime;
}
