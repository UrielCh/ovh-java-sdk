package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Graylog stream
 */
public class OvhStream {
	/**
	 * ColdStorage retention in year
	 *
	 * canBeNull && readOnly
	 */
	public Long coldStorageRetention;

	/**
	 * Enable Websocket
	 *
	 * canBeNull && readOnly
	 */
	public Boolean webSocketEnabled;

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
	 * Notify on new ColdStorage archive
	 *
	 * canBeNull && readOnly
	 */
	public Boolean coldStorageNotifyEnabled;

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
	 * Is ColdStorage enabled?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean coldStorageEnabled;

	/**
	 * Stream description
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * ColdStorage compression method
	 *
	 * canBeNull && readOnly
	 */
	public OvhStreamColdStorageCompressionEnum coldStorageCompression;

	/**
	 * Stream last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
