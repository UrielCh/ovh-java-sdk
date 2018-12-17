package net.minidev.ovh.api.cloud.operation;

import java.util.Date;

/**
 * Operation
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
	 * Resource handled by the operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhResource resource;

	/**
	 * The progression in percentage of the operation
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * The action of the operation
	 *
	 * canBeNull && readOnly
	 */
	public String action;

	/**
	 * The started date of the operation
	 *
	 * canBeNull && readOnly
	 */
	public Date startedAt;

	/**
	 * Unique id to describe the operation
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Operation status
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStatusEnum status;
}
