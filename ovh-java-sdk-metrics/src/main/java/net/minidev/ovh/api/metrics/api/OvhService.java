package net.minidev.ovh.api.metrics.api;

/**
 * Structure holding the elements about a service
 */
public class OvhService {
	/**
	 * Offer used for the service
	 *
	 * canBeNull && readOnly
	 */
	public String offer;

	/**
	 * Quota used for the service
	 *
	 * canBeNull && readOnly
	 */
	public OvhOption quota;

	/**
	 * Name of a service
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Description of a service
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Structure holding the info to get the metrics from your service
	 *
	 * canBeNull && readOnly
	 */
	public OvhMetricsAccess metrics;

	/**
	 * Region holding the service
	 *
	 * canBeNull && readOnly
	 */
	public OvhRegion region;

	/**
	 * Type of the service: cloud or live
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferTypeEnum type;

	/**
	 * Status of a service
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceStatusEnum status;
}
