package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Graylog stream
 */
public class OvhStream {
	/**
	 * Indicates if the current user can create alert on the stream
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canAlert;

	/**
	 * Enable Websocket
	 *
	 * canBeNull && readOnly
	 */
	public Boolean webSocketEnabled;

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
	 * Parent stream id
	 *
	 * canBeNull && readOnly
	 */
	public String parentStreamId;

	/**
	 * Stream description
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * Cold storage retention in year
	 *
	 * canBeNull && readOnly
	 */
	public Long coldStorageRetention;

	/**
	 * Stream creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Number of coldstored archives
	 *
	 * canBeNull && readOnly
	 */
	public Long nbArchive;

	/**
	 * ColdStorage destination
	 *
	 * canBeNull && readOnly
	 */
	public OvhStreamColdStorageTargetEnum coldStorageTarget;

	/**
	 * Indicates if you are allowed to edit entry
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isEditable;

	/**
	 * Notify on new Cold storage archive
	 *
	 * canBeNull && readOnly
	 */
	public Boolean coldStorageNotifyEnabled;

	/**
	 * Indicates if you are allowed to share entry
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isShareable;

	/**
	 * Associated DBaaS Logs option
	 *
	 * canBeNull && readOnly
	 */
	public String optionId;

	/**
	 * ColdStorage content
	 *
	 * canBeNull && readOnly
	 */
	public OvhStreamColdStorageContentEnum coldStorageContent;

	/**
	 * Is Cold storage enabled?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean coldStorageEnabled;

	/**
	 * Cold storage compression method
	 *
	 * canBeNull && readOnly
	 */
	public OvhStreamColdStorageCompressionEnum coldStorageCompression;

	/**
	 * Enable ES indexing
	 *
	 * canBeNull && readOnly
	 */
	public Boolean indexingEnabled;

	/**
	 * Stream last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
