package net.minidev.ovh.api.dedicated.server;

/**
 * Information about the options of a dedicated server
 */
public class OvhOption {
	/**
	 * The state of the option
	 *
	 * canBeNull && readOnly
	 */
	public OvhOptionStateEnum state;

	/**
	 * The option name
	 *
	 * canBeNull && readOnly
	 */
	public OvhOptionEnum option;
}
