package net.minidev.ovh.api.freefax;

/**
 * Return credit balance informations structure
 */
public class OvhBalanceInformations {
	/**
	 * The number of equivalement remaining french faxs
	 *
	 * canBeNull
	 */
	public Long faxs;

	/**
	 * Total balance available in points
	 *
	 * canBeNull
	 */
	public Long points;
}
