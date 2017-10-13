package net.minidev.ovh.api.telephony;

/**
 * Trunk service
 */
public class OvhTrunk {
	/**
	 * Type of the service
	 *
	 * canBeNull && readOnly
	 */
	public OvhTypeServiceEnum serviceType;

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
}
