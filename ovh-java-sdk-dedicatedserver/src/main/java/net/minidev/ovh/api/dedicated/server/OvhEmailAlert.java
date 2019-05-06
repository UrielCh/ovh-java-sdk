package net.minidev.ovh.api.dedicated.server;

/**
 * Service monitoring Email alert
 */
public class OvhEmailAlert {
	/**
	 * Alert language
	 *
	 * canBeNull && readOnly
	 */
	public OvhAlertLanguageEnum language;

	/**
	 * This monitoring id
	 *
	 * canBeNull && readOnly
	 */
	public Long alertId;

	/**
	 * Alert destination
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * Is this monitor enabled
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enabled;
}
