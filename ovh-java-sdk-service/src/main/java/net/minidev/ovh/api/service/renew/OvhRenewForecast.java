package net.minidev.ovh.api.service.renew;

/**
 * Representation of service's renew forecasting
 */
public class OvhRenewForecast {
	/**
	 * Forecast details
	 *
	 * canBeNull && readOnly
	 */
	public OvhRenewForecastDetail[] details;

	/**
	 * Prices for renew forecasting
	 *
	 * canBeNull && readOnly
	 */
	public OvhRenewForecastDetailPrices prices;
}
