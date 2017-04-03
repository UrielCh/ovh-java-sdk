package net.minidev.ovh.api.sms;

/**
 * Phone book
 */
public class OvhPhonebook {
	/**
	 * Phone key identifier between the phone and phonebooks
	 *
	 * canBeNull && readOnly
	 */
	public String phoneKey;

	/**
	 * Phonebook name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Identifier of the phonebook
	 *
	 * canBeNull && readOnly
	 */
	public String bookKey;
}
