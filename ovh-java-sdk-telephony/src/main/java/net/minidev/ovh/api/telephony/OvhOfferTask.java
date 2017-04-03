package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Operation on a telephony offer
 */
public class OvhOfferTask {
	/**
	 * Planned execution date
	 *
	 * canBeNull && readOnly
	 */
	public Date executionDate;

	/**
	 * Actual action that will be executed
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferTaskActionEnum action;

	/**
	 * Type of operation that will be executed
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferTaskTypeEnum type;

	/**
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Current status of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
