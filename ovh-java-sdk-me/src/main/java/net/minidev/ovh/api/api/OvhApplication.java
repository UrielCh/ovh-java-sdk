package net.minidev.ovh.api.api;

/**
 * API Application
 */
public class OvhApplication {
	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public String applicationKey;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public Long applicationId;

	/**
	 * canBeNull && readOnly
	 */
	public OvhApplicationStatusEnum status;
}
