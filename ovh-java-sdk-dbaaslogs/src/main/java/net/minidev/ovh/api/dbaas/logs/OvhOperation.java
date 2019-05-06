package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Asynchronous operation
 */
public class OvhOperation {
	/**
	 * Input used
	 *
	 * canBeNull && readOnly
	 */
	public String inputId;

	/**
	 * Operation creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

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
	 * Alias used
	 *
	 * canBeNull && readOnly
	 */
	public String aliasId;

	/**
	 * Role used
	 *
	 * canBeNull && readOnly
	 */
	public String roleId;

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
