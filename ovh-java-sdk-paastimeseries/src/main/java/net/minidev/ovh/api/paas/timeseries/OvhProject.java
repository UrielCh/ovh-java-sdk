package net.minidev.ovh.api.paas.timeseries;

/**
 * Project
 */
public class OvhProject {
	/**
	 * Name
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Id
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Region
	 *
	 * canBeNull && readOnly
	 */
	public OvhRegion region;
}
