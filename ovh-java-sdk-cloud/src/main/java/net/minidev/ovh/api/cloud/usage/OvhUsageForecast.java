package net.minidev.ovh.api.cloud.usage;

import java.util.Date;
import net.minidev.ovh.api.cloud.billingview.OvhHourlyResources;
import net.minidev.ovh.api.cloud.billingview.OvhMonthlyResources;
import net.minidev.ovh.api.cloud.billingview.OvhUsedCredits;

/**
 * UsageForecast
 */
public class OvhUsageForecast {
	/**
	 * Usable credit to pay next bill
	 *
	 * canBeNull && readOnly
	 */
	public OvhUsedCredits usableCredits;

	/**
	 * Monthly forecast
	 *
	 * canBeNull && readOnly
	 */
	public OvhMonthlyResources monthlyUsage;

	/**
	 * Forecast dates (from/to)
	 *
	 * canBeNull && readOnly
	 */
	public OvhPeriod period;

	/**
	 * Entry last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Hourly forecast
	 *
	 * canBeNull && readOnly
	 */
	public OvhHourlyResources hourlyUsage;
}
