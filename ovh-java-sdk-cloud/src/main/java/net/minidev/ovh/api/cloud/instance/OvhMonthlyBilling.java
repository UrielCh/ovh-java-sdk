package net.minidev.ovh.api.cloud.instance;

import java.util.Date;

/**
 * MonthlyBilling
 */
public class OvhMonthlyBilling {
	/**
	 * Monthly billing status
	 *
	 * canBeNull && readOnly
	 */
	public OvhMonthlyBillingStatusEnum status;

	/**
	 * Monthly billing activated since
	 *
	 * canBeNull && readOnly
	 */
	public Date since;
}
