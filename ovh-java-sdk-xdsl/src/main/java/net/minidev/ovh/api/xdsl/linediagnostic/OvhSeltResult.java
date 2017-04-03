package net.minidev.ovh.api.xdsl.linediagnostic;

import java.util.Date;

/**
 * Customer answers for line diagnostic
 */
public class OvhSeltResult {
	/**
	 * SELT test running date
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * Distance of the problem identified on the line (by SELT test), from NRA to customer
	 *
	 * canBeNull
	 */
	public Long distance;

	/**
	 * Prelocalization of the problem
	 *
	 * canBeNull
	 */
	public OvhSeltPrelocEnum preloc;

	/**
	 * Problem type identified by SELT test
	 *
	 * canBeNull
	 */
	public OvhSeltStateEnum state;

	/**
	 * SELT test status
	 *
	 * canBeNull
	 */
	public OvhSeltStatusEnum status;
}
