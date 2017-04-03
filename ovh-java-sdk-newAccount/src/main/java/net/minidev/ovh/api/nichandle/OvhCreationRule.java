package net.minidev.ovh.api.nichandle;

/**
 * Describe all rules for a given field
 */
public class OvhCreationRule {
	/**
	 * Name of the field
	 *
	 * canBeNull
	 */
	public String fieldName;

	/**
	 * List of allowed values for the field
	 *
	 * canBeNull
	 */
	public String[] in;

	/**
	 * Regular expression to validate the field value
	 *
	 * canBeNull
	 */
	public String regularExpression;

	/**
	 * Prefix of the field value
	 *
	 * canBeNull
	 */
	public String prefix;

	/**
	 * Whether the field is mandatory
	 *
	 * canBeNull
	 */
	public Boolean mandatory;
}
