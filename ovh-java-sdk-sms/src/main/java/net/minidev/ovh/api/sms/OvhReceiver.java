package net.minidev.ovh.api.sms;

import java.util.Date;

/**
 * Sms receivers preloaded
 */
public class OvhReceiver {
	/**
	 * Creation date of the document
	 *
	 * canBeNull && readOnly
	 */
	public Date datetime;

	/**
	 * Download file from URL before sending to contacts (works only with csvUrl and not document ID)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean autoUpdate;

	/**
	 * Number of receiver records in the document
	 *
	 * canBeNull && readOnly
	 */
	public Long records;

	/**
	 * Is the object compatible with autoUpdate
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canAutoUpdate;

	/**
	 * Description name of the document
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Slot number id
	 *
	 * canBeNull && readOnly
	 */
	public Long slotId;
}
