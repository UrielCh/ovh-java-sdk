package net.minidev.ovh.api.nichandle.document;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhSafeKeyValue;

/**
 * List of documents added on your account
 */
public class OvhDocument {
	/**
	 * URL used to get document
	 *
	 * canBeNull && readOnly
	 */
	public String getUrl;

	/**
	 * Document size (in bytes)
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * URL used to put document
	 *
	 * canBeNull && readOnly
	 */
	public String putUrl;

	/**
	 * Document name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Document id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Document validation
	 *
	 * canBeNull && readOnly
	 */
	public Date validationDate;

	/**
	 * Document creation
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Document tags
	 *
	 * canBeNull && readOnly
	 */
	public OvhSafeKeyValue<String>[] tags;

	/**
	 * Document expiration
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
