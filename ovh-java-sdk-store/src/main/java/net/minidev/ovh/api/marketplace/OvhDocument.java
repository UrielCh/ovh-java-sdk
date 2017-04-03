package net.minidev.ovh.api.marketplace;

import net.minidev.ovh.api.complextype.OvhSafeKeyValue;

/**
 * Document
 */
public class OvhDocument {
	/**
	 * str
	 *
	 * canBeNull && readOnly
	 */
	public String getUrl;

	/**
	 * str
	 *
	 * canBeNull && readOnly
	 */
	public String size;

	/**
	 * str
	 *
	 * canBeNull && readOnly
	 */
	public String putUrl;

	/**
	 * str
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Unique identifier
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * str
	 *
	 * canBeNull && readOnly
	 */
	public String creationDate;

	/**
	 * Attached tags
	 *
	 * canBeNull && readOnly
	 */
	public OvhSafeKeyValue<String>[] tags;
}
