package net.minidev.ovh.api.dbaaslogs;

import java.util.Date;

/**
 * Input operation
 */
public class OvhOperation {
	/**
	 * Operation creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Input used
	 *
	 * canBeNull && readOnly
	 */
	public String inputId;

	/**
	 * Stream used
	 *
	 * canBeNull && readOnly
	 */
	public String streamId;

	/**
	 * Dashboard used
	 *
	 * canBeNull && readOnly
	 */
	public String dashboardId;

	/**
	 * Role used
	 *
	 * canBeNull && readOnly
	 */
	public String roleId;

	/**
	 * Alias used
	 *
	 * canBeNull && readOnly
	 */
	public String aliasId;

	/**
	 * Operation UUID
	 *
	 * canBeNull && readOnly
	 */
	public String operationId;

	/**
	 * Index used
	 *
	 * canBeNull && readOnly
	 */
	public String indexId;

	/**
	 * Operation status
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationState state;

	/**
	 * Operation last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
