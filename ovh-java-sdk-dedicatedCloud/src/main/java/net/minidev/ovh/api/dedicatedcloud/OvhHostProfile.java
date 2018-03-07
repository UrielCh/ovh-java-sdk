package net.minidev.ovh.api.dedicatedcloud;

/**
 * Host profiles actually available in Private Cloud
 */
public class OvhHostProfile {
	/**
	 * Name of Host profile
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Id of Host profile
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
