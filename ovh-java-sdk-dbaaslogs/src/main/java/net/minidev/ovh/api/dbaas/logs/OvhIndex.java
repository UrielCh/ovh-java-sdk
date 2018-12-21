package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Elasticsearch index
 */
public class OvhIndex {
	/**
	 * Index creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Notify if size is near 80, 90 or 100 %
	 *
	 * canBeNull && readOnly
	 */
	public Boolean alertNotifyEnabled;

	/**
	 * Indicates if you are allowed to edit entry
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isEditable;

	/**
	 * Indicates if you are allowed to share entry
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isShareable;

	/**
	 * Index name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Index UUID
	 *
	 * canBeNull && readOnly
	 */
	public String indexId;

	/**
	 * Index description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Associated DBaaS Logs option
	 *
	 * canBeNull && readOnly
	 */
	public String optionId;

	/**
	 * Maximum index size (in bytes)
	 *
	 * canBeNull && readOnly
	 */
	public Long maxSize;

	/**
	 * Index last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
