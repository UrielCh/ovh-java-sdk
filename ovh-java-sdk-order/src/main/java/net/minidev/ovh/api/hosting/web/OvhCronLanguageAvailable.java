package net.minidev.ovh.api.hosting.web;

/**
 * Language available for cron script
 */
public class OvhCronLanguageAvailable {
	/**
	 * Php versions
	 *
	 * canBeNull
	 */
	public OvhPhpVersionAvailableEnum[] php;

	/**
	 * NodeJS versions
	 *
	 * canBeNull
	 */
	public OvhNodejsVersionAvailableEnum[] nodejs;
}
