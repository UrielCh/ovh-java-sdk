package net.minidev.ovh.api.dedicated.nastask;

import java.util.Date;
import net.minidev.ovh.api.dedicated.OvhTaskStatusEnum;
import net.minidev.ovh.api.dedicated.storage.OvhTaskFunctionEnum;

/**
 * Storage task
 */
public class OvhTask {
	/**
	 * name of the partition
	 *
	 * canBeNull && readOnly
	 */
	public String partitionName;

	/**
	 * last modification of task
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Insertion of task in the todo
	 *
	 * canBeNull && readOnly
	 */
	public Date todoDate;

	/**
	 * information about operation
	 *
	 * canBeNull && readOnly
	 */
	public String details;

	/**
	 * the date when the task finished
	 *
	 * canBeNull && readOnly
	 */
	public Date doneDate;

	/**
	 * Task type of operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskFunctionEnum operation;

	/**
	 * id of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * The actual state of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;

	/**
	 * the name of your service
	 *
	 * canBeNull && readOnly
	 */
	public String storageName;
}
