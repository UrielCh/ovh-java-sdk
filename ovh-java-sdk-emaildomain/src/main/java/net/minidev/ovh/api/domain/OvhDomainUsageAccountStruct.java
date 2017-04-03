package net.minidev.ovh.api.domain;

import java.util.Date;

/**
 * Structure of usage account
 */
public class OvhDomainUsageAccountStruct {
	/**
	 * Timestamp
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * Size of mailbox (bytes)
	 *
	 * canBeNull
	 */
	public Long quota;

	/**
	 * Number of message in mailbox
	 *
	 * canBeNull
	 */
	public Long emailCount;
}
