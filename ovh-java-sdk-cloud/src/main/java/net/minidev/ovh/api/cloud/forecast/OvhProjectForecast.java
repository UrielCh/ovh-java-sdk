package net.minidev.ovh.api.cloud.forecast;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * ProjectForecast
 */
public class OvhProjectForecast {
	/**
	 * Forecast for your whole project
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice projectForecast;

	/**
	 * Time when we got last metric
	 *
	 * canBeNull && readOnly
	 */
	public Date lastMetric;
}
