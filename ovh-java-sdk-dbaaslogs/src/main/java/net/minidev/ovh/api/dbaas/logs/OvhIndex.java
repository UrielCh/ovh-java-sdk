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
	 * Indicates if you are allowed to edit entry
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isEditable;

	/**
	 * Index name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Index description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Index UUID
	 *
	 * canBeNull && readOnly
	 */
	public String indexId;

	/**
	 * Associated DBaaS Logs option
	 *
	 * canBeNull && readOnly
	 */
	public String optionId;

	/**
	 * Index last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
