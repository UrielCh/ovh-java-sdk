package net.minidev.ovh.api.sms;

import net.minidev.ovh.api.telephony.OvhTaskStatusEnum;

/**
 * Operation on a SMS service
 */
public class OvhTask {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTodoGeneralPublicFunctionsEnum function;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTodoGeneralPublicStepsEnum step;

	/**
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
