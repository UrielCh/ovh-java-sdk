package net.minidev.ovh.api.license.office;

/**
 * Office tenant
 */
public class OvhOfficeTenant {
	/**
	 * Contact's fisrt name
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

	/**
	 * Contact's zip code
	 *
	 * canBeNull && readOnly
	 */
	public String zipCode;

	/**
	 * Contact's fisrt name
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

	/**
	 * Contact's address line
	 *
	 * canBeNull && readOnly
	 */
	public String address;

	/**
	 * Primary phone number
	 *
	 * canBeNull && readOnly
	 */
	public String phone;

	/**
	 * Contact's city
	 *
	 * canBeNull && readOnly
	 */
	public String city;

	/**
	 * Tenant's display name
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * canBeNull && readOnly
	 */
	public OvhServiceStateEnum status;
}
