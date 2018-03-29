package net.minidev.ovh.api.xdsl.email.pro;

import java.util.Date;

/**
 * Task Struct
 */
public class OvhTask {
	/**
	 * Function of the task
	 *
	 * canBeNull
	 */
	public String function;

	/**
	 * Todo date of the task
	 *
	 * canBeNull
	 */
	public Date todoDate;

	/**
	 * Finished date of the task
	 *
	 * canBeNull
	 */
	public Date finishDate;

	/**
	 * Status of the task
	 *
	 * canBeNull
	 */
	public OvhTaskStatusEnum status;
}
