package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Sounds attached to this telephony account
 */
public class OvhSound {
	/**
	 * URL to get sound file
	 *
	 * canBeNull && readOnly
	 */
	public String getUrl;

	/**
	 * Sound filename
	 *
	 * canBeNull && readOnly
	 */
	public String filename;

	/**
	 * Sound file size (in bytes)
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * URL to upload sound file
	 *
	 * canBeNull && readOnly
	 */
	public String putUrl;

	/**
	 * Sound description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Sound ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Sound creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
