package net.minidev.ovh.api.zone;

/**
 * Zone status
 */
public class OvhStatus {
	/**
	 * Warning list
	 *
	 * canBeNull
	 */
	public String[] warnings;

	/**
	 * True if the zone has successfully been deployed
	 *
	 * canBeNull
	 */
	public Boolean isDeployed;

	/**
	 * Error list
	 *
	 * canBeNull
	 */
	public String[] errors;
}
