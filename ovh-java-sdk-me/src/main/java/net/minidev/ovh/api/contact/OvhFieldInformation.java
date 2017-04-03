package net.minidev.ovh.api.contact;

/**
 * Extras informations about a field
 */
public class OvhFieldInformation {
	/**
	 * Name of the field concerned by restrictions
	 *
	 * canBeNull && readOnly
	 */
	public String fieldName;

	/**
	 * Indicates if the field can't be edited
	 *
	 * canBeNull && readOnly
	 */
	public Boolean readOnly;

	/**
	 * Indicates if the field is mandatory when editing
	 *
	 * canBeNull && readOnly
	 */
	public Boolean mandatory;
}
