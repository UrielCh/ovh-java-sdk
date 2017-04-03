package net.minidev.ovh.api.dbaaslogs;

import java.util.Date;

/**
 * Graylog stream
 */
public class OvhStream {
	/**
	 * Stream creation
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
	 * Stream UUID
	 *
	 * canBeNull && readOnly
	 */
	public String streamId;

	/**
	 * Stream description
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
	 * Stream description
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * Stream last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
