package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Stair details of a Building
 */
public class OvhBuildingStair {
	/**
	 * Stair identifier, "_NA_" if no identifier is available
	 *
	 * canBeNull
	 */
	public String stair;

	/**
	 * List of floor indentifier, "_NA_" if no identifier is available
	 *
	 * canBeNull
	 */
	public String[] floors;
}
