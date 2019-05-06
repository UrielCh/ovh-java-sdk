package net.minidev.ovh.api.license.office;

import java.util.Date;

/**
 * Office tenant
 */
public class OvhOfficeTenant {
	/**
	 * Tenant's service type
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceTypeEnum serviceType;

	/**
	 * Contact's fisrt name
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

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
	public String firstName;

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
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * canBeNull && readOnly
	 */
	public OvhServiceStateEnum status;
}
