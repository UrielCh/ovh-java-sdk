package net.minidev.ovh.api.xdsl;

/**
 * information about availabilities to migrate in PPP
 */
public class OvhPPPMigrationInfo {
	/**
	 * some information if you can not migrate
	 *
	 * canBeNull
	 */
	public String reason;

	/**
	 * boolean to know if the access can migrate
	 *
	 * canBeNull
	 */
	public Boolean canMigrate;
}
