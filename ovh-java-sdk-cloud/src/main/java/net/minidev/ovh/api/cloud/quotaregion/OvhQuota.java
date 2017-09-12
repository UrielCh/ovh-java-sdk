package net.minidev.ovh.api.cloud.quotaregion;

/**
 * Quota
 */
public class OvhQuota {
	/**
	 * Quota on volumes
	 *
	 * canBeNull && readOnly
	 */
	public OvhVolumeQuota volume;

	/**
	 * Quota on instances
	 *
	 * canBeNull && readOnly
	 */
	public OvhInstanceQuota instance;

	/**
	 * Quota on keypairs
	 *
	 * canBeNull && readOnly
	 */
	public OvhKeypairQuota keypair;

	/**
	 * Quota on networks
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkQuota network;
}
