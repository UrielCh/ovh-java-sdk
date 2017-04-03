package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.coretypes.OvhCountryEnum;

/**
 * Contact informations structure
 */
public class OvhContact {
	/**
	 * Contact zip
	 *
	 * canBeNull
	 */
	public String zip;

	/**
	 * Contact country
	 *
	 * canBeNull
	 */
	public OvhCountryEnum country;

	/**
	 * Contact firstname
	 *
	 * canBeNull
	 */
	public String firstname;

	/**
	 * Contact address
	 *
	 * canBeNull
	 */
	public String address;

	/**
	 * Contact phone
	 *
	 * canBeNull
	 */
	public String phone;

	/**
	 * Contact city
	 *
	 * canBeNull
	 */
	public String city;

	/**
	 * Contact name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Contact organisation
	 *
	 * canBeNull
	 */
	public String organisation;

	/**
	 * canBeNull
	 */
	public String email;
}
