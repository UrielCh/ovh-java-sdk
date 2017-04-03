package net.minidev.ovh.api.cloud.project;

/**
 * New cloud project
 */
public class OvhNewProject {
	/**
	 * Cloud project order id
	 *
	 * canBeNull
	 */
	public Long orderId;

	/**
	 * Cloud project
	 *
	 * canBeNull
	 */
	public String project;

	/**
	 * Agreement to valid
	 *
	 * canBeNull
	 */
	public Long[] agreements;

	/**
	 * Cloud project description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Cloud credit
	 *
	 * canBeNull
	 */
	public OvhNewProjectCredit credit;

	/**
	 * Project creation status
	 *
	 * canBeNull
	 */
	public OvhNewProjectStatusEnum status;
}
