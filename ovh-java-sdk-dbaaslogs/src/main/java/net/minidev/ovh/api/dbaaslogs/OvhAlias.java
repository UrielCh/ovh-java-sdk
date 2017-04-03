package net.minidev.ovh.api.dbaaslogs;

import java.util.Date;

/**
 * Elasticsearch alias
 */
public class OvhAlias {
	/**
	 * Input creation
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
	 * Alias UUID
	 *
	 * canBeNull && readOnly
	 */
	public String aliasId;

	/**
	 * Alias name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Alias description
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
	 * Input last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
