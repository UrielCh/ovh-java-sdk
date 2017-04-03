package net.minidev.ovh.api.license;

import java.util.Date;

/**
 * licenses Todos
 */
public class OvhTask {
	/**
	 * The last time this Task was updated
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * This Task name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * When was this Task created
	 *
	 * canBeNull && readOnly
	 */
	public Date todoDate;

	/**
	 * This Task description
	 *
	 * canBeNull && readOnly
	 */
	public OvhActionType action;

	/**
	 * When was this Task done
	 *
	 * canBeNull && readOnly
	 */
	public Date doneDate;

	/**
	 * This Task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Current Taks status
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStateEnum status;
}
