package net.minidev.ovh.api.cloud.region;

/**
 * OpenstackService
 */
public class OvhOpenstackService {
	/**
	 * Service name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Service status
	 *
	 * canBeNull && readOnly
	 */
	public OvhOpenstackServiceStatusEnum status;
}
