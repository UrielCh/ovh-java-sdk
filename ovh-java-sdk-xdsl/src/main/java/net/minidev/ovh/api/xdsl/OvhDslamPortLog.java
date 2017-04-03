package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * A message log from the DSLAM
 */
public class OvhDslamPortLog {
	/**
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * The number of times this message occured between date and lastOccurrenceDate
	 *
	 * canBeNull && readOnly
	 */
	public Long numberOfOccurrences;

	/**
	 * The last time this message occured
	 *
	 * canBeNull && readOnly
	 */
	public Date lastOccurrenceDate;

	/**
	 * canBeNull && readOnly
	 */
	public String message;
}
