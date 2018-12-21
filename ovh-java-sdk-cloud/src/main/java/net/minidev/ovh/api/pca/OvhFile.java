package net.minidev.ovh.api.pca;

/**
 * cloud archives files
 */
public class OvhFile {
	/**
	 * File SHA256 hash
	 *
	 * canBeNull && readOnly
	 */
	public String SHA256;

	/**
	 * File SHA1 hash
	 *
	 * canBeNull && readOnly
	 */
	public String SHA1;

	/**
	 * File size, in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * File name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * File id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * File state
	 *
	 * canBeNull && readOnly
	 */
	public String state;

	/**
	 * File type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * File MD5 hash
	 *
	 * canBeNull && readOnly
	 */
	public String MD5;
}
