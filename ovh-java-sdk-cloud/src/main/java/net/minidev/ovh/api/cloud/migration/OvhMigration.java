package net.minidev.ovh.api.cloud.migration;

import java.util.Date;

/**
 * Migration
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
	public String migrationId;

	/**
	 * The id of the resource to migrate
	 *
	 * canBeNull && readOnly
	 */
	public String resourceId;

	/**
	 * The type of the resource to migrate
	 *
	 * canBeNull && readOnly
	 */
	public OvhResourceTypeEnum resourceType;
}
