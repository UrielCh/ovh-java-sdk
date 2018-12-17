package net.minidev.ovh.api.cloud.storage;

import java.util.Date;

/**
 * ContainerObject
 */
public class OvhContainerObject {
	/**
	 * Object size
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * Object retrieval delay (when unsealing)
	 *
	 * canBeNull && readOnly
	 */
	public Long retrievalDelay;

	/**
	 * Object name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Object retrieval state
	 *
	 * canBeNull && readOnly
	 */
	public OvhRetrievalStateEnum retrievalState;

	/**
	 * Last modification date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastModified;

	/**
	 * Object content type
	 *
	 * canBeNull && readOnly
	 */
	public String contentType;
}
