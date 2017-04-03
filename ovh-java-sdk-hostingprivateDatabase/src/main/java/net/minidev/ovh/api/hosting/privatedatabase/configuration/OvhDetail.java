package net.minidev.ovh.api.hosting.privatedatabase.configuration;

import java.util.Date;

/**
 * Configuration detail property
 */
public class OvhDetail {
	/**
	 * Configuration unit type
	 *
	 * canBeNull
	 */
	public String unit;

	/**
	 * Configuration default value
	 *
	 * canBeNull
	 */
	public String defaultValue;

	/**
	 * Configuration last update date
	 *
	 * canBeNull
	 */
	public Date lastUpdate;

	/**
	 * Configuration description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Configuration available values
	 *
	 * canBeNull
	 */
	public String[] availableValues;

	/**
	 * Configuration value type
	 *
	 * canBeNull
	 */
	public OvhDetailType type;

	/**
	 * Configuration current value
	 *
	 * canBeNull
	 */
	public String value;

	/**
	 * Configuration key name
	 *
	 * canBeNull
	 */
	public String key;
}
