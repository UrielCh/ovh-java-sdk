package net.minidev.ovh.api.partner;

/**
 * Partner contact
 */
public class OvhContact {
	/**
	 * Contact's first name
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

	/**
	 * Newsletter subscription choice
	 *
	 * canBeNull && readOnly
	 */
	public String newsletter;

	/**
	 * Contact's last name
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

	/**
	 * Contact's twitter url
	 *
	 * canBeNull && readOnly
	 */
	public String twitter;

	/**
	 * Contact's function in the company
	 *
	 * canBeNull && readOnly
	 */
	public String role;

	/**
	 * Contact's phone number
	 *
	 * canBeNull && readOnly
	 */
	public String phone;

	/**
	 * Contact's facebook url
	 *
	 * canBeNull && readOnly
	 */
	public String facebook;

	/**
	 * List of nics to associate with this contact
	 *
	 * canBeNull && readOnly
	 */
	public String[] otherNics;

	/**
	 * Contact's linkedin url
	 *
	 * canBeNull && readOnly
	 */
	public String linkedin;

	/**
	 * Contact's email
	 *
	 * canBeNull && readOnly
	 */
	public String email;
}
