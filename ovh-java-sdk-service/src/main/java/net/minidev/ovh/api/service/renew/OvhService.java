package net.minidev.ovh.api.service.renew;

/**
 * Description of a service
 */
public class OvhService {
	/**
	 * Type of the service
	 *
	 * canBeNull && readOnly
	 */
	public String serviceType;

	/**
	 * ID of the service
	 *
	 * canBeNull && readOnly
	 */
	public Long serviceId;

	/**
	 * Name of the service
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;
}
