package net.minidev.ovh.api.dedicated.nasha;

/**
 * Storage nas HA
 */
public class OvhStorage {
	/**
	 * the size of the nas
	 *
	 * canBeNull && readOnly
	 */
	public Long zpoolSize;

	/**
	 * True, if partition creation is allowed on this nas HA
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canCreatePartition;

	/**
	 * Access ip of nas
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * percentage of nas space used in %
	 *
	 * canBeNull && readOnly
	 */
	public Long zpoolCapacity;

	/**
	 * The name you give to the nas
	 *
	 * canBeNull && readOnly
	 */
	public String customName;

	/**
	 * area of nas
	 *
	 * canBeNull && readOnly
	 */
	public String datacenter;

	/**
	 * The storage service name
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Send an email to customer if any issue is detected
	 *
	 * canBeNull && readOnly
	 */
	public Boolean monitored;
}
