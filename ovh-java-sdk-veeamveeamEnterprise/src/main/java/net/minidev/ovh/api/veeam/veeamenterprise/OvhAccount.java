package net.minidev.ovh.api.veeam.veeamenterprise;

/**
 * Veeeam Enterprise offer
 */
public class OvhAccount {
	/**
	 * OVH Enterprise Manager IP
	 *
	 * canBeNull && readOnly
	 */
	public String sourceIp;

	/**
	 * This Backup Server port
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * This Backup Server IP
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Your Veeam Enterprise Service name
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;
}
