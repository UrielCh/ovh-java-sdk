package net.minidev.ovh.api.dbaaslogs;

import java.util.Date;

/**
 * Config test results
 */
public class OvhTestResult {
	/**
	 * Standard output
	 *
	 * canBeNull && readOnly
	 */
	public String stdout;

	/**
	 * Standard error
	 *
	 * canBeNull && readOnly
	 */
	public String stderr;

	/**
	 * Last config test update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
