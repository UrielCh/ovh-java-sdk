package net.minidev.ovh.api.iploadbalancing.task;

import java.util.Date;
import net.minidev.ovh.api.iploadbalancing.OvhTaskActionEnum;
import net.minidev.ovh.api.iploadbalancing.OvhTaskStatusEnum;

/**
 * IP Load Balancing Operations
 */
public class OvhTask {
	/**
	 * Operation progress percentage
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * Operation type
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskActionEnum action;

	/**
	 * Id of the operation
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Creation date of your operation
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Current status of your operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
