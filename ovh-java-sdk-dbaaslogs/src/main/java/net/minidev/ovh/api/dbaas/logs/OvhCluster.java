package net.minidev.ovh.api.dbaas.logs;

/**
 * Cluster
 */
public class OvhCluster {
	/**
	 * Cluster type
	 *
	 * canBeNull && readOnly
	 */
	public OvhClusterClusterTypeEnum clusterType;

	/**
	 * Hostname
	 *
	 * canBeNull && readOnly
	 */
	public String hostname;

	/**
	 * All content generated by given service will be placed on this cluster
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isDefault;

	/**
	 * PEM for dedicated inputs
	 *
	 * canBeNull && readOnly
	 */
	public String dedicatedInputPEM;

	/**
	 * Allow given service to perform advanced operations on cluster
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isUnlocked;

	/**
	 * Cluster UUID
	 *
	 * canBeNull && readOnly
	 */
	public String clusterId;

	/**
	 * Data center localization
	 *
	 * canBeNull && readOnly
	 */
	public OvhClusterRegionEnum region;

	/**
	 * PEM for direct inputs
	 *
	 * canBeNull && readOnly
	 */
	public String directInputPEM;
}
