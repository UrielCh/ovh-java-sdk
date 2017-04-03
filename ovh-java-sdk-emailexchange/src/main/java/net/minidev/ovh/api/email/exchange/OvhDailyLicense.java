package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Exchange account license per day
 */
public class OvhDailyLicense {
	/**
	 * canBeNull
	 */
	public Date date;

	/**
	 * canBeNull
	 */
	public Long outlookQuantity;

	/**
	 * canBeNull
	 */
	public OvhAccountLicense[] accountLicense;
}
