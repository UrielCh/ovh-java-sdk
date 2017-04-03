package net.minidev.ovh.api.cloud.quota;

/**
 * Quotas
 */
public class OvhQuotas {
	/**
	 * Quotas on volumes
	 *
	 * canBeNull && readOnly
	 */
	public OvhVolumeQuotas volume;

	/**
	 * Quotas on instances
	 *
	 * canBeNull && readOnly
	 */
	public OvhInstanceQuotas instance;

	/**
	 * Quotas on keypairs
	 *
	 * canBeNull && readOnly
	 */
	public OvhKeypairQuotas keypair;

	/**
	 * Region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
