package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * The web access for your cloudpabx
 */
public class OvhBannerAccess {
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
