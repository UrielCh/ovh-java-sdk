package net.minidev.ovh.api.telephony;

/**
 * Phone book on group
 */
public class OvhPhonebookMaster {
	/**
	 * Phone book name
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
