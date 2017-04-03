package net.minidev.ovh.api.saas.csp2;

/**
 * Office licence
 */
public class OvhOfficeLicence {
	/**
	 * License name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Maximum purchasable license
	 *
	 * canBeNull && readOnly
	 */
	public Long limit;

	/**
	 * License unique identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
