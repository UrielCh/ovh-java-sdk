package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations bandwidth orderable for this dedicated server
 */
public class OvhTrafficOrderable {
	/**
	 * Is traffic orderable for this server
	 *
	 * canBeNull
	 */
	public Boolean orderable;

	/**
	 * traffic orderable
	 *
	 * canBeNull
	 */
	public OvhTrafficOrderEnum[] traffic;
}
