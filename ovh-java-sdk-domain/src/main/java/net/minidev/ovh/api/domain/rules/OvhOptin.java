package net.minidev.ovh.api.domain.rules;

import net.minidev.ovh.api.domain.OvhContactAllTypesEnum;
import net.minidev.ovh.api.domain.OvhOptinFieldsEnum;

/**
 * Representation of the optin rule
 */
public class OvhOptin {
	/**
	 * Displayed fields
	 *
	 * canBeNull && readOnly
	 */
	public OvhOptinFieldsEnum[] fields;

	/**
	 * Contact's type associated to the optin rule
	 *
	 * canBeNull && readOnly
	 */
	public OvhContactAllTypesEnum type;
}
