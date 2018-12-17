package net.minidev.ovh.api.reseller;

import java.util.Date;

/**
 * Reseller task
 */
public class OvhTask {
	/**
	 * Task current step
	 *
	 * canBeNull && readOnly
	 */
	public String currentStep;

	/**
	 * Task last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdateDate;

	/**
	 * Task percentage progression
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * Task expected done date
	 *
	 * canBeNull && readOnly
	 */
	public Date expectedDoneDate;

	/**
	 * Task name
	 *
	 * canBeNull && readOnly
	 */
	public String taskName;

	/**
	 * Task id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Linked product
	 *
	 * canBeNull && readOnly
	 */
	public String productDomain;

	/**
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskTypeEnum taskStatus;
}
