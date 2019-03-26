package net.minidev.ovh.api.overthebox;

import java.util.Date;

/**
 * Device action
 */
public class OvhDeviceAction {
	/**
	 * Date of creation of the action
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The name of the action
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The id of the action
	 *
	 * canBeNull && readOnly
	 */
	public String actionId;

	/**
	 * Date of execution of the action
	 *
	 * canBeNull && readOnly
	 */
	public Date todoDate;

	/**
	 * The details of the action
	 *
	 * canBeNull && readOnly
	 */
	public String details;

	/**
	 * Last time the action was updated
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;

	/**
	 * The status of the action
	 *
	 * canBeNull && readOnly
	 */
	public OvhActionStatusEnum status;
}
