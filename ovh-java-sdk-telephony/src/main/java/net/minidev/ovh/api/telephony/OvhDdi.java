package net.minidev.ovh.api.telephony;

/**
 * DDI (direct dial-in) service
 */
public class OvhDdi {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeServiceEnum serviceType;

	/**
	 * canBeNull && readOnly
	 */
	public String destination;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum featureType;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;
}
