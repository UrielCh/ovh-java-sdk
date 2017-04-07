package net.minidev.ovh.api.storage;

/**
 * 
 */
public class OvhObject {
	/**
	 * Object size in bytes
	 *
	 * canBeNull && readOnly
	 */
	public int size;

	/**
	 * Object name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Last modification date
	 *
	 * canBeNull && readOnly
	 */
	public String lastModified;

	/**
	 * Object content type
	 *
	 * canBeNull && readOnly
	 */
	public String contentType;
}
