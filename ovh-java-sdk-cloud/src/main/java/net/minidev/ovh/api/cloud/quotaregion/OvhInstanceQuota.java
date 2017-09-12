package net.minidev.ovh.api.cloud.quotaregion;

/**
 * InstanceQuota
 */
public class OvhInstanceQuota {
	/**
	 * canBeNull && readOnly
	 */
	public Long maxRam;

	/**
	 * Current used ram
	 *
	 * canBeNull && readOnly
	 */
	public Long usedRAM;

	/**
	 * Maximum total cores allowed in your project
	 *
	 * canBeNull && readOnly
	 */
	public Long maxCores;

	/**
	 * Current used instances
	 *
	 * canBeNull && readOnly
	 */
	public Long usedInstances;

	/**
	 * Current used cores number
	 *
	 * canBeNull && readOnly
	 */
	public Long usedCores;

	/**
	 * Maximum total cores allowed in your project
	 *
	 * canBeNull && readOnly
	 */
	public Long maxInstances;
}
