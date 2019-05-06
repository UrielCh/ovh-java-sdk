package net.minidev.ovh.api.horizonview;

/**
 * Horizon View as a Service
 */
public class OvhDedicatedHorizon {
	/**
	 * View Storage Accelerator for Vcenter
	 *
	 * canBeNull && readOnly
	 */
	public Boolean storageAccelerator;

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
	 * The location of your administration servers in our datacenter
	 *
	 * canBeNull && readOnly
	 */
	public OvhZone masterZone;

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
	 * Version of your Dedicated Horizon
	 *
	 * canBeNull && readOnly
	 */
	public String version;
}
