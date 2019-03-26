package net.minidev.ovh.api.iploadbalancing.quotahistory;

import java.util.Date;

/**
 * QuotaHistory
 */
public class OvhQuotaHistory {
	/**
	 * Total used quota value in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long total;

	/**
	 * The last time your quota was resetted (billed)
	 *
	 * canBeNull && readOnly
	 */
	public Date resetDate;

	/**
	 * Historized date for this quota entry
	 *
	 * canBeNull && readOnly
	 */
	public Date historizedDate;

	/**
	 * Zone of your quota
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * The last time your quota was updated from your Load Balancer instance
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdateDate;

	/**
	 * Id of your quota
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
