package net.minidev.ovh.api.saas.csp2;

import java.util.Date;

/**
 * Office tenant
 */
public class OvhOfficeTenant {
	/**
	 * Contact's first name
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
	 * Contact's last name
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
	 * Internal service name
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Tenant's status
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceStateEnum status;
}
