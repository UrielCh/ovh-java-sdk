package net.minidev.ovh.api.telephony;

/**
 * Additional number
 */
public class OvhNumber {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeServiceEnum serviceType;

	/**
	 * Feature enabled on the number
	 *
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum featureType;

	/**
	 * Description of the service
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Name of the service
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Parent of the service (if it is part of a pool)
	 *
	 * canBeNull && readOnly
	 */
	public String partOfPool;
}
