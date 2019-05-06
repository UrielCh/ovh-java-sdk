package net.minidev.ovh.api.dedicated.nas;

/**
 * Storage nas
 */
public class OvhNas {
	/**
	 * the size of the nas
	 *
	 * canBeNull && readOnly
	 */
	public Long zpoolSize;

	/**
	 * True, if partition creation is allowed on this nas
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canCreatePartition;

	/**
	 * The storage mount path
	 *
	 * canBeNull && readOnly
	 */
	public String mountPath;

	/**
	 * Access ip of nas
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

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
}
