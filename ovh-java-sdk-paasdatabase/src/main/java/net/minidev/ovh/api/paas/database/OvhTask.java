package net.minidev.ovh.api.paas.database;

import java.util.Date;
import net.minidev.ovh.api.paas.database.task.OvhStatus;

/**
 * Tasks
 */
public class OvhTask {
	/**
	 * Task function name
	 *
	 * canBeNull && readOnly
	 */
	public String function;

	/**
	 * Task last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Task percentage progression ( 0 = begin / 100 = done )
	 *
	 * canBeNull && readOnly
	 */
	public Long percentage;

	/**
	 * Task completion date
	 *
	 * canBeNull && readOnly
	 */
	public Date doneDate;

	/**
	 * Task id
	 *
	 * canBeNull && readOnly
	 */
	public String taskId;

	/**
	 * Task start date
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;

	/**
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
