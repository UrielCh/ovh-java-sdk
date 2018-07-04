package net.minidev.ovh.api.telephony;

/**
 * Document linked to a portability
 */
public class OvhPortabilityDocument {
	/**
	 * URL to get document
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
	 * URL to upload document
	 *
	 * canBeNull && readOnly
	 */
	public String putUrl;

	/**
	 * Name of the document
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Description of the document
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Identifier of the document
	 *
	 * canBeNull && readOnly
	 */
	public Long documentId;
}
