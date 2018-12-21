package net.minidev.ovh.api.iploadbalancing;

import java.util.Date;

/**
 * Available servers states
 */
public class OvhServerState {
	/**
	 * Status of last health check
	 *
	 * canBeNull
	 */
	public String checkStatus;

	/**
	 * Id of your instance
	 *
	 * canBeNull
	 */
	public Long instanceId;

	/**
	 * Time of last health check
	 *
	 * canBeNull
	 */
	public Date checkTime;

	/**
	 * Last health check contents or textual error
	 *
	 * canBeNull
	 */
	public String lastCheckContent;

	/**
	 * Status
	 *
	 * canBeNull
	 */
	public String status;

	/**
	 * Layer5-7 code, if available
	 *
	 * canBeNull
	 */
	public String checkCode;
}
