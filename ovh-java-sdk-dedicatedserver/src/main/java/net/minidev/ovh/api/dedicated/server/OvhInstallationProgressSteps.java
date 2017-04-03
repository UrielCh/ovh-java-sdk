package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations about this dedicated server installation steps
 */
public class OvhInstallationProgressSteps {
	/**
	 * Informations about this installation step
	 *
	 * canBeNull
	 */
	public String comment;

	/**
	 * Error details if state is error
	 *
	 * canBeNull
	 */
	public String error;

	/**
	 * Status of this installation step
	 *
	 * canBeNull
	 */
	public OvhInstallationProgressStatusEnum status;
}
