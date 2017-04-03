package net.minidev.ovh.api.overthebox;

/**
 * Task
 */
public class OvhTask {
	/**
	 * The name of the task
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The id of the task
	 *
	 * canBeNull && readOnly
	 */
	public String taskId;

	/**
	 * The status of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
