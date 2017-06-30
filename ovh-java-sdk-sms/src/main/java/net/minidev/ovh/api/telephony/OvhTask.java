package net.minidev.ovh.api.telephony;

/**
 * Operation on a telephony service
 */
public class OvhTask {
	/**
	 * canBeNull && readOnly
	 */
	public String serviceType;

	/**
	 * Action associated with the task
	 *
	 * canBeNull && readOnly
	 */
	public String action;

	/**
	 * Object potentially created at the end of the task
	 *
	 * canBeNull && readOnly
	 */
	public String objectCreated;

	/**
	 * Potential failure reason of the task
	 *
	 * canBeNull && readOnly
	 */
	public String message;

	/**
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Status of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
