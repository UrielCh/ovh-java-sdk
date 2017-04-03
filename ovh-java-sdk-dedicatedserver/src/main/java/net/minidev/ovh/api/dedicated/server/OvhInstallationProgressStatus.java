package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations about this dedicated server installation status
 */
public class OvhInstallationProgressStatus {
	/**
	 * Installation steps
	 *
	 * canBeNull
	 */
	public OvhInstallationProgressSteps[] progress;

	/**
	 * Elapsed time in seconds since installation beggining
	 *
	 * canBeNull
	 */
	public Long elapsedTime;
}
