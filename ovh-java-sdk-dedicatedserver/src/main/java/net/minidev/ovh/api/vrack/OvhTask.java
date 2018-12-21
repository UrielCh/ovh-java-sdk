package net.minidev.ovh.api.vrack;

import java.util.Date;

/**
 * vrack tasks
 */
public class OvhTask {
	/**
	 * canBeNull && readOnly
	 */
	public String targetDomain;

	/**
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * canBeNull && readOnly
	 */
	public String function;

	/**
	 * canBeNull && readOnly
	 */
	public Date todoDate;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
