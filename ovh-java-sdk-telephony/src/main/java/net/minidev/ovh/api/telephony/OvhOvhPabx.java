package net.minidev.ovh.api.telephony;

/**
 * OVH calls queues and OVH IVRs (Interactive Voice Response)
 */
public class OvhOvhPabx {
	/**
	 * General type of the service
	 *
	 * canBeNull && readOnly
	 */
	public OvhTypeServiceEnum serviceType;

	/**
	 * Does the service have extended CCS options enabled?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isCCS;

	/**
	 * Feature of the service
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
	 * canBeNull && readOnly
	 */
	public String serviceName;
}
