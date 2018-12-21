package net.minidev.ovh.api.telephony;

/**
 * Redirect service
 */
public class OvhRedirect {
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
