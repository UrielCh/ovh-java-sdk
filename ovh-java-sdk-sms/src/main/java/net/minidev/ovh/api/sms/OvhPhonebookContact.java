package net.minidev.ovh.api.sms;

/**
 * Phone book contact
 */
public class OvhPhonebookContact {
	/**
	 * Home mobile phone number of the contact
	 *
	 * canBeNull && readOnly
	 */
	public String homeMobile;

	/**
	 * Contact surname
	 *
	 * canBeNull && readOnly
	 */
	public String surname;

	/**
	 * Home landline phone number of the contact
	 *
	 * canBeNull && readOnly
	 */
	public String homePhone;

	/**
	 * Contact name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Landline phone office number of the contact
	 *
	 * canBeNull && readOnly
	 */
	public String workPhone;

	/**
	 * Contact identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Mobile phone office number of the contact
	 *
	 * canBeNull && readOnly
	 */
	public String workMobile;

	/**
	 * Group name of the phonebook
	 *
	 * canBeNull && readOnly
	 */
	public String group;
}
