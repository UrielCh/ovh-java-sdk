package net.minidev.ovh.api.hosting.privatedatabase;

import net.minidev.ovh.api.hosting.privatedatabase.database.extension.OvhStatus;

/**
 * Databases extension
 */
public class OvhDatabaseExtension {
	/**
	 * Extension name
	 *
	 * canBeNull && readOnly
	 */
	public String extensionName;

	/**
	 * Extension description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Name of required extensions to enable this one
	 *
	 * canBeNull && readOnly
	 */
	public String[] requiredExtensions;

	/**
	 * Extension status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
