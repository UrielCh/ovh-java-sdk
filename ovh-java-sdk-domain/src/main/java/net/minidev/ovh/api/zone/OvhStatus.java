package net.minidev.ovh.api.zone;

/**
 * Zone status
 */
public class OvhStatus {
	/**
	 * True if the zone has successfully been deployed
	 *
	 * canBeNull
	 */
	public Boolean isDeployed;

	/**
	 * Warning list
	 *
	 * canBeNull
	 */
	public String[] warnings;

	/**
	 * Error list
	 *
	 * canBeNull
	 */
	public String[] errors;
}
