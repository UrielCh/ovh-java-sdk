package net.minidev.ovh.api.dedicatedcloud;

/**
 * List of Service Pack compliant with the current Private Cloud
 */
public class OvhServicePack {
	/**
	 * Name of the Service Pack
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Options available in the Service Pack
	 *
	 * canBeNull && readOnly
	 */
	public String[] options;
}
