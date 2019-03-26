package net.minidev.ovh.api.nichandle;

import java.util.Date;
import net.minidev.ovh.api.domain.OvhOperationActionEnum;
import net.minidev.ovh.api.domain.OvhOperationStatusEnum;
import net.minidev.ovh.api.domain.OvhOperationStep;

/**
 * Domain operation progress
 */
public class OvhDomainTaskProgressBar {
	/**
	 * Current step of the operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStep currentStep;

	/**
	 * Action possible on task
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationActionEnum[] taskActions;

	/**
	 * The last update date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdateDate;

	/**
	 * all the steps of operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStep[] followUpSteps;

	/**
	 * Progress percentage of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * The estimated end date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date expectedDoneDate;

	/**
	 * The status of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStatusEnum taskStatus;
}
