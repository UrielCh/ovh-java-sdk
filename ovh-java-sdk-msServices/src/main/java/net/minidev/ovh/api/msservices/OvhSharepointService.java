package net.minidev.ovh.api.msservices;

/**
 * Sharepoint service
 */
public class OvhSharepointService {
	/**
	 * Shared space maximum size in byte
	 *
	 * canBeNull && readOnly
	 */
	public Long quota;

	/**
	 * Internal service name
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Shared space usage in byte
	 *
	 * canBeNull && readOnly
	 */
	public Long currentUsage;

	/**
	 * Sharepoint service state
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceStateEnum state;

	/**
	 * Sharepoint url
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * Task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
