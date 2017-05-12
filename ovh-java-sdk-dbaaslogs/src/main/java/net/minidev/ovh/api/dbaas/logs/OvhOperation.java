package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Asynchronous operation
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
	 * Option used
	 *
	 * canBeNull && readOnly
	 */
	public String optionId;

	/**
	 * Operation status
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStateEnum state;

	/**
	 * Operation last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
