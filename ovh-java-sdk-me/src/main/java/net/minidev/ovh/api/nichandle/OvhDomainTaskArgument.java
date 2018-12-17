package net.minidev.ovh.api.nichandle;

import net.minidev.ovh.api.domain.OvhDocumentFormatsEnum;
import net.minidev.ovh.api.xander.OvhContactFieldEnum;

/**
 * Domain operation argument
 */
public class OvhDomainTaskArgument {
	/**
	 * Template of the content
	 *
	 * canBeNull && readOnly
	 */
	public String template;

	/**
	 * Minimum of the content length that you can send
	 *
	 * canBeNull && readOnly
	 */
	public Long minimumSize;

	/**
	 * Description of the argument
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * List of accepted formats
	 *
	 * canBeNull && readOnly
	 */
	public OvhDocumentFormatsEnum[] acceptedFormats;

	/**
	 * Maximum of the content length that you can send
	 *
	 * canBeNull && readOnly
	 */
	public Long maximumSize;

	/**
	 * True if the argument is in read only
	 *
	 * canBeNull && readOnly
	 */
	public Boolean readOnly;

	/**
	 * Type of the argument
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * List of impacted field names
	 *
	 * canBeNull && readOnly
	 */
	public OvhContactFieldEnum[] fields;

	/**
	 * Value of the argument
	 *
	 * canBeNull && readOnly
	 */
	public String value;

	/**
	 * Key of the argument
	 *
	 * canBeNull && readOnly
	 */
	public String key;

	/**
	 * List of accepted values
	 *
	 * canBeNull && readOnly
	 */
	public String[] acceptedValues;
}
