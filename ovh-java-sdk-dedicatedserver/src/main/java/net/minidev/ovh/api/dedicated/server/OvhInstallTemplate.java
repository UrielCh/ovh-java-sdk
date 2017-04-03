package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations about an Installation templates
 */
public class OvhInstallTemplate {
	/**
	 * Names list of ovh installationtemplates compatibles with this server
	 *
	 * canBeNull
	 */
	public String[] ovh;

	/**
	 * Names list of yours installation templates compatibles with this server
	 *
	 * canBeNull
	 */
	public String[] personal;
}
