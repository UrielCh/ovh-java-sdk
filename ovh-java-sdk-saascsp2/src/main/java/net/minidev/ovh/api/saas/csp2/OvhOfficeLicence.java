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
	 * Maximum purchasable license
	 *
	 * canBeNull && readOnly
	 */
	public Long limit;

	/**
	 * License name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * License unique identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
