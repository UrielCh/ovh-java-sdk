package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Telephony API related file hosted
 */
public class OvhPcsFile {
	/**
	 * canBeNull && readOnly
	 */
	public String filename;

	/**
	 * canBeNull && readOnly
	 */
	public Date urlExpirationDatetime;

	/**
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPcsFileStatusEnum status;
}
