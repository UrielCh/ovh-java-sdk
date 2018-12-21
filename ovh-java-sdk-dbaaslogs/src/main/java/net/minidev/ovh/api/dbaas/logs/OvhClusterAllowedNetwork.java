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
	 * Flow type
	 *
	 * canBeNull && readOnly
	 */
	public OvhClusterAllowedNetworkFlowTypeEnum flowType;

	/**
	 * IP block
	 *
	 * canBeNull && readOnly
	 */
	public String network;
}
