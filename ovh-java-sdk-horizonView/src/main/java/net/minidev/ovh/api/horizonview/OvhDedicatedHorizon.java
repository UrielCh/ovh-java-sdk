package net.minidev.ovh.api.horizonview;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Horizon View as a Service
 */
public class OvhDedicatedHorizon {
	/**
	 * The location of your datacenter
	 *
	 * canBeNull && readOnly
	 */
	public OvhZone privateCloudZone;

	/**
	 * Url of your Dedicated Horizon
	 *
	 * canBeNull && readOnly
	 */
	public String publicUrl;

	/**
	 * Current state of your Dedicated Horizon
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Your Horizon Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public String privateCloudName;

	/**
	 * Domain of your Dedicated Horizon
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Get the number of available public IPs
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> numberOfAvailableIp;

	/**
	 * Version of your Dedicated Horizon
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * Your Cloud Desktop Infrastructure pack
	 *
	 * canBeNull && readOnly
	 */
	public OvhOffer pack;
}
