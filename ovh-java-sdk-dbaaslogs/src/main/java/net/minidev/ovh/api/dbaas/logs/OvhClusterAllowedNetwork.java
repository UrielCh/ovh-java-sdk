package net.minidev.ovh.api.dbaas.logs;

/**
 * Cluster allowed network
 */
public class OvhClusterAllowedNetwork {
	/**
	 * Network UUID
	 *
	 * canBeNull && readOnly
	 */
	public String allowedNetworkId;

	/**
	 * IP block
	 *
	 * canBeNull && readOnly
	 */
	public String network;

	/**
	 * Flow type
	 *
	 * canBeNull && readOnly
	 */
	public OvhClusterAllowedNetworkFlowTypeEnum flowType;
}
