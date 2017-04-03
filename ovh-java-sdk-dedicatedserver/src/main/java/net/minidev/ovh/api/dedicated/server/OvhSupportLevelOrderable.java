package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations support level orderable for this dedicated server
 */
public class OvhSupportLevelOrderable {
	/**
	 * Is a support level is orderable for this server
	 *
	 * canBeNull
	 */
	public Boolean orderable;

	/**
	 * Support level  orderable
	 *
	 * canBeNull
	 */
	public OvhSupportLevelOrderableEnum[] levels;
}
