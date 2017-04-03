package net.minidev.ovh.api.xdsl;

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
	 * Date when the action will start
	 *
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
	public OvhTaskStatusEnum status;
}
