package net.minidev.ovh.api.veeamcloudconnect;

/**
 * Details about Veeam Cloud Connect offer
 */
public class OvhOfferCapabilities {
	/**
	 * Is wan accelerator enabled
	 *
	 * canBeNull
	 */
	public Boolean wanAccelerator;

	/**
	 * Are data replicated over two storages
	 *
	 * canBeNull
	 */
	public Boolean replication;

	/**
	 * Is account allowed to add new repositories
	 *
	 * canBeNull
	 */
	public Boolean multiStorages;

	/**
	 * Max number of repositories you can add on your account
	 *
	 * canBeNull
	 */
	public Long maxStoragesCount;

	/**
	 * Maximum quota you can apply on your repositories in GB
	 *
	 * canBeNull
	 */
	public Long maxQuota;

	/**
	 * Included storage per vm
	 *
	 * canBeNull
	 */
	public Long vmCapacity;

	/**
	 * Required usage on all repositories to add a new one (percent)
	 *
	 * canBeNull
	 */
	public Long minimumUsage;

	/**
	 * Default quota applied on new repositories in GB
	 *
	 * canBeNull
	 */
	public Long defaultQuota;
}
