package net.minidev.ovh.api.pack.xdsl;

import java.util.Date;

/**
 * Describes the current status of a task
 */
public class OvhTask {
	/**
	 * canBeNull && readOnly
	 */
	public Date updateDate;

	/**
	 * canBeNull && readOnly
	 */
	public String function;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
