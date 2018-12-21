package net.minidev.ovh.api.cloud;

/**
 * Information about the different components available in the region
 */
public class OvhComponent {
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
	public OvhServiceStatus status;
}
