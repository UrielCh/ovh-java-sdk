package net.minidev.ovh.api.domain.configurations;

import net.minidev.ovh.api.domain.OvhContactAllTypesEnum;
import net.minidev.ovh.api.domain.OvhOptinFieldsEnum;

/**
 * Representation of the optin configuration
 */
public class OvhOptin {
	/**
	 * Contact's type associated to the optin configuration
	 *
	 * canBeNull && readOnly
	 */
	public OvhContactAllTypesEnum type;

	/**
	 * Displayed fields
	 *
	 * canBeNull && readOnly
	 */
	public OvhOptinFieldsEnum[] fields;
}
