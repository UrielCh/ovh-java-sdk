package net.minidev.ovh.api.veeamcloudconnect;

import java.util.Date;

/**
 * Operation with the Cloud Tenant Account
 */
public class OvhTask {
	/**
	 * When was this Task done
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * Task name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Current progress
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * Current Task state
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * When the task has been created
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;
}
