package net.minidev.ovh.api.iploadbalancing.quotahistory;

import java.util.Date;

/**
 * QuotaHistory
 */
public class OvhQuotaHistory {
	/**
	 * Total (IN+OUT) used quota value in bytes
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
	 * Zone of your quota
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * In used quota value in bytes since last reset date
	 *
	 * canBeNull && readOnly
	 */
	public Long in;

	/**
	 * Historized date for this quota entry
	 *
	 * canBeNull && readOnly
	 */
	public Date historizedDate;

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

	/**
	 * Out used quota value in bytes since last reset date
	 *
	 * canBeNull && readOnly
	 */
	public Long out;
}
