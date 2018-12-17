package net.minidev.ovh.api.domain.configurations;

import net.minidev.ovh.api.domain.OvhContactAllTypesEnum;

/**
 * Representation of the obfuscated emails configuration
 */
public class OvhObfuscatedEmails {
	/**
	 * Contact's type associated to the obfuscated email
	 *
	 * canBeNull && readOnly
	 */
	public OvhContactAllTypesEnum type;

	/**
	 * Obfuscated email value
	 *
	 * canBeNull && readOnly
	 */
	public String value;
}
