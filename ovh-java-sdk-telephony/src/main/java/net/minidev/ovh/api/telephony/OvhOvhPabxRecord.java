package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * The PABX records
 */
public class OvhOvhPabxRecord {
	/**
	 * The duration in seconds of the recorded call
	 *
	 * canBeNull && readOnly
	 */
	public Long duration;

	/**
	 * The agent number of the recorded call
	 *
	 * canBeNull && readOnly
	 */
	public String agent;

	/**
	 * The caller number of the recorded call
	 *
	 * canBeNull && readOnly
	 */
	public String callerIdNumber;

	/**
	 * The begin date of the recorded call
	 *
	 * canBeNull && readOnly
	 */
	public Date callStart;

	/**
	 * The record sound url
	 *
	 * canBeNull && readOnly
	 */
	public String fileUrl;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The caller name of the recorded call
	 *
	 * canBeNull && readOnly
	 */
	public String callerIdName;

	/**
	 * The end date of the recorded call
	 *
	 * canBeNull && readOnly
	 */
	public Date callEnd;

	/**
	 * The destination number of the recorded call
	 *
	 * canBeNull && readOnly
	 */
	public String destinationNumber;
}
