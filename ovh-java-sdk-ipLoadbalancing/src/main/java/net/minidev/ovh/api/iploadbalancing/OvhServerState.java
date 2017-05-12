package net.minidev.ovh.api.iploadbalancing;

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
	 * Last health check contents or textual error
	 *
	 * canBeNull
	 */
	public String lastCheckContent;

	/**
	 * Layer5-7 code, if available
	 *
	 * canBeNull
	 */
	public String checkCode;

	/**
	 * Status
	 *
	 * canBeNull
	 */
	public String status;
}
