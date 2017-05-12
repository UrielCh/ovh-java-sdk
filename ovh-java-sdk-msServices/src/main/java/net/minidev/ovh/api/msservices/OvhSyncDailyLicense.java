package net.minidev.ovh.api.msservices;

import java.util.Date;

/**
 * Sync account license per day
 */
public class OvhSyncDailyLicense {
	/**
	 * the date used to determine sync account license usage
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * sync account license usage
	 *
	 * canBeNull
	 */
	public OvhSyncAccountLicense[] accountLicense;
}
