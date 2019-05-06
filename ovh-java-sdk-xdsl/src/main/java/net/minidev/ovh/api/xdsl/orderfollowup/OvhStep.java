package net.minidev.ovh.api.xdsl.orderfollowup;

import java.util.Date;

/**
 * A step of the order process
 */
public class OvhStep {
	/**
	 * canBeNull
	 */
	public String[] comments;

	/**
	 * canBeNull
	 */
	public OvhStepNameEnum name;

	/**
	 * canBeNull
	 */
	public OvhDurationUnitEnum durationUnit;

	/**
	 * canBeNull
	 */
	public Long expectedDuration;

	/**
	 * canBeNull
	 */
	public Date doneDate;

	/**
	 * canBeNull
	 */
	public OvhStepStatusEnum status;
}
