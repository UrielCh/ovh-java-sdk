package net.minidev.ovh.api.xdsl.eligibility;

/**
 * a line
 */
public class OvhLine {
	/**
	 * The line status
	 *
	 * canBeNull
	 */
	public OvhLandlineStatusEnum lineStatus;

	/**
	 * The line address
	 *
	 * canBeNull
	 */
	public OvhAddress address;

	/**
	 * The contact name
	 *
	 * canBeNull
	 */
	public String contactName;

	/**
	 * The line number
	 *
	 * canBeNull
	 */
	public String lineNumber;
}
