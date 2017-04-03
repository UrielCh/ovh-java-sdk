package net.minidev.ovh.api.paas.database;

import net.minidev.ovh.api.paas.database.instance.database.extension.OvhStatus;

/**
 * Databases extension
 */
public class OvhInstanceDatabaseExtension {
	/**
	 * Extension name
	 *
	 * canBeNull && readOnly
	 */
	public String extensionName;

	/**
	 * Name of required extensions to enable this one
	 *
	 * canBeNull && readOnly
	 */
	public String[] requiredExtensions;

	/**
	 * Extension description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Extension status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
