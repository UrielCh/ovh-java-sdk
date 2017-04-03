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
	 * canBeNull && readOnly
	 */
	public String action;

	/**
	 * canBeNull && readOnly
	 */
	public String message;

	/**
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
