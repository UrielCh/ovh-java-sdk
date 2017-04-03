package net.minidev.ovh.api.sms;

import java.util.Date;

/**
 * The web access for your virtual number chat application
 */
public class OvhChatAccess {
	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The creation date of this access
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * The url of the web access
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
