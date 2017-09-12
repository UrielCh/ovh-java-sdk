package net.minidev.ovh.api.iploadbalancing.quota;

import java.util.Date;

/**
 * Quota informations for current billing period for this zone
 */
public class OvhQuota {
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
	 * Quota alert value in bytes. When reached, we will send you an alert. Default : included quota with your offer
	 *
	 * canBeNull && readOnly
	 */
	public Long alert;

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
	 * The last time your quota was updated from your Load Balancer instance
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdateDate;

	/**
	 * Included quota value with your offer, in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long included;

	/**
	 * Out used quota value in bytes since last reset date
	 *
	 * canBeNull && readOnly
	 */
	public Long out;
}
