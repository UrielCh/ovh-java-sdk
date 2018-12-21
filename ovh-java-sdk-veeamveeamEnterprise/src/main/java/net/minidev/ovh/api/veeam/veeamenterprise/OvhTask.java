package net.minidev.ovh.api.veeam.veeamenterprise;

import java.util.Date;
import net.minidev.ovh.api.veeamenterprise.OvhTaskStateEnum;

/**
 * Operation with the Enterprise Account
 */
public class OvhTask {
	/**
	 * Task completion date
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
	 * Task creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;

	/**
	 * Task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;
}
