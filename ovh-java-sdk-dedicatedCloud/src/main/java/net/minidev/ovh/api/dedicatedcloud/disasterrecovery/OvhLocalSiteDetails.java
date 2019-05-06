package net.minidev.ovh.api.dedicatedcloud.disasterrecovery;

/**
 * Information on the local datacenter
 */
public class OvhLocalSiteDetails {
	/**
	 * Zvm mode configured
	 *
	 * canBeNull
	 */
	public OvhSiteRoleEnum role;

	/**
	 * Local Network Ip of the Zerto virtual manager
	 *
	 * canBeNull
	 */
	public String zvmIp;

	/**
	 * Installed version of Zerto
	 *
	 * canBeNull
	 */
	public String zertoVersion;

	/**
	 * Type of hosting for the local datacenter
	 *
	 * canBeNull
	 */
	public OvhSiteTypeEnum type;
}
