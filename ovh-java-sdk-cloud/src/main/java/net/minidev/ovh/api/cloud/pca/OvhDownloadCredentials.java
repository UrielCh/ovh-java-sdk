package net.minidev.ovh.api.cloud.pca;

/**
 * Openstack swift credentials for your PCA offer
 */
public class OvhDownloadCredentials {
	/**
	 * Openstack swift container name
	 *
	 * canBeNull
	 */
	public String container;

	/**
	 * Openstack storage URL
	 *
	 * canBeNull
	 */
	public String storageEndpoint;

	/**
	 * Openstack user password
	 *
	 * canBeNull
	 */
	public String password;

	/**
	 * Openstack tenant name
	 *
	 * canBeNull
	 */
	public String tenantName;

	/**
	 * Openstack authentication URL
	 *
	 * canBeNull
	 */
	public String authEndpoint;

	/**
	 * Openstack tenant id
	 *
	 * canBeNull
	 */
	public String tenantId;

	/**
	 * Openstack region name
	 *
	 * canBeNull
	 */
	public String region;

	/**
	 * Openstack user login
	 *
	 * canBeNull
	 */
	public String login;
}
