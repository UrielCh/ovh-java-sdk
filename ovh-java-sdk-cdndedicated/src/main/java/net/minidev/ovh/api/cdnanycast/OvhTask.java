package net.minidev.ovh.api.cdnanycast;

/**
 * Task on a CDN
 */
public class OvhTask {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTaskFunctionEnum function;

	/**
	 * canBeNull && readOnly
	 */
	public String comment;

	/**
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTaskStateEnum status;
}
