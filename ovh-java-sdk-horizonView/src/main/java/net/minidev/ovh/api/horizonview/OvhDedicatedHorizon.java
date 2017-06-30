package net.minidev.ovh.api.horizonview;

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
	 * Your Horizon Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public String privateCloudName;

	/**
	 * Current state of your Dedicated Horizon
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Version of your Dedicated Horizon
	 *
	 * canBeNull && readOnly
	 */
	public String version;
}
