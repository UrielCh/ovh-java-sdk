package net.minidev.ovh.api.cloud.project;

/**
 * Error that can occur when creating a Public Cloud project
 */
public class OvhNewProjectInfoError {
	/**
	 * Error code
	 *
	 * canBeNull
	 */
	public OvhNewProjectInfoErrorCodeEnum code;

	/**
	 * Error message
	 *
	 * canBeNull
	 */
	public String message;
}
