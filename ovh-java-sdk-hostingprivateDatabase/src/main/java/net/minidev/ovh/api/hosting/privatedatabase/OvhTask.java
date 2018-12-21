package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;
import net.minidev.ovh.api.hosting.privatedatabase.task.OvhFunctionEnum;
import net.minidev.ovh.api.hosting.privatedatabase.task.OvhStatusEnum;

/**
 * Tasks
 */
public class OvhTask {
	/**
	 * Database name on which the task is working
	 *
	 * canBeNull && readOnly
	 */
	public String databaseName;

	/**
	 * Last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Function name
	 *
	 * canBeNull && readOnly
	 */
	public OvhFunctionEnum function;

	/**
	 * DumpId on which the task is working
	 *
	 * canBeNull && readOnly
	 */
	public Long dumpId;

	/**
	 * The id of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * User name on which the task is working
	 *
	 * canBeNull && readOnly
	 */
	public String userName;

	/**
	 * Completion date
	 *
	 * canBeNull && readOnly
	 */
	public Date doneDate;

	/**
	 * Task Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;

	/**
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
