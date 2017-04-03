package net.minidev.ovh.api.dedicated.server;

import java.util.Date;

/**
 * A structure describing IPMI test result
 */
public class OvhIpmiTestResult {
	/**
	 * Test running date
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * Test result
	 *
	 * canBeNull
	 */
	public String status;
}
