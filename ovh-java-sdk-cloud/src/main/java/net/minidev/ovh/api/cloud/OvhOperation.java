package net.minidev.ovh.api.cloud;

import java.util.Date;

/**
 * An operation is an async process on your Project
 */
public class OvhOperation {
	/**
	 * The creation date of the operation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The completed date of the operation
	 *
	 * canBeNull && readOnly
	 */
	public Date completedAt;

	/**
	 * Affected regions of the operation
	 *
	 * canBeNull && readOnly
	 */
	public String[] regions;

	/**
	 * The started date of the operation
	 *
	 * canBeNull && readOnly
	 */
	public Date startedAt;

	/**
	 * The action of the operation
	 *
	 * canBeNull && readOnly
	 */
	public String action;

	/**
	 * The progression in percentage of the operation
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * Unique ID to describe the operation
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Operation status
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStatus status;
}
