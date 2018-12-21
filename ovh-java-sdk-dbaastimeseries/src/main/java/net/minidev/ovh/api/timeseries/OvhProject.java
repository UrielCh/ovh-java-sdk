package net.minidev.ovh.api.timeseries;

/**
 * Timeseries project
 */
public class OvhProject {
	/**
	 * region where your data are located
	 *
	 * canBeNull && readOnly
	 */
	public String regionId;

	/**
	 * name of your project
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * subscribed offer
	 *
	 * canBeNull && readOnly
	 */
	public String offerId;

	/**
	 * description of your project
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * timeseries Project id
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * project status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusTypeEnum status;
}
