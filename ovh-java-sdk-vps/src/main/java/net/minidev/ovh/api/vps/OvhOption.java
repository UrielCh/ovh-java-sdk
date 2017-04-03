package net.minidev.ovh.api.vps;

/**
 * Information about the options of a VPS Virtual Machine
 */
public class OvhOption {
	/**
	 * The state of the option
	 *
	 * canBeNull && readOnly
	 */
	public OvhVpsOptionStateEnum state;

	/**
	 * The option name
	 *
	 * canBeNull && readOnly
	 */
	public OvhVpsOptionEnum option;
}
