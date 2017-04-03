package net.minidev.ovh.api.sms;

import java.util.Date;

/**
 * SMS blacklist
 */
public class OvhBlacklist {
	/**
	 * The sms number blacklisted
	 *
	 * canBeNull && readOnly
	 */
	public String number;

	/**
	 * canBeNull && readOnly
	 */
	public Date dateCreation;
}
