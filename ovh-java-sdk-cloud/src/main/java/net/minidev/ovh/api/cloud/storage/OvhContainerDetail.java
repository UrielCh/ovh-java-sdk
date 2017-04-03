package net.minidev.ovh.api.cloud.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContainerDetail
 */
public class OvhContainerDetail {
	/**
	 * Total bytes stored
	 *
	 * canBeNull && readOnly
	 */
	public Long storedBytes;

	/**
	 * Origins allowed to make Cross Origin Requests
	 *
	 * canBeNull && readOnly
	 */
	public String[] cors;

	/**
	 * Public container
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("public")
	public Boolean _public;

	/**
	 * Objects stored in container
	 *
	 * canBeNull && readOnly
	 */
	public OvhContainerObject[] objects;

	/**
	 * Container name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Whether this is an archive container or not
	 *
	 * canBeNull && readOnly
	 */
	public Boolean archive;

	/**
	 * Container static URL
	 *
	 * canBeNull && readOnly
	 */
	public String staticUrl;

	/**
	 * Total objects stored
	 *
	 * canBeNull && readOnly
	 */
	public Long storedObjects;

	/**
	 * Container region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
