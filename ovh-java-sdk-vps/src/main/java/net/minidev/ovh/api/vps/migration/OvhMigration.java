package net.minidev.ovh.api.vps.migration;

import java.util.Date;

/**
 * Description not available
 */
public class OvhMigration {
	/**
	 * The planned date of the migration
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Migration Id
	 *
	 * canBeNull && readOnly
	 */
	public String id;
}
