package net.minidev.ovh.api.telephony;

/**
 * Phone book
 */
public class OvhPhonebook {
	/**
	 * Set if phonebook is readonly
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isReadonly;

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
