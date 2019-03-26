package net.minidev.ovh.api.saas.csp2;

/**
 * Office licence
 */
public class OvhOfficeLicence {
	/**
	 * License's type, indicates if the licence is standalone or an addon
	 *
	 * canBeNull && readOnly
	 */
	public OvhLicenseTypeEnum licenceType;

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
