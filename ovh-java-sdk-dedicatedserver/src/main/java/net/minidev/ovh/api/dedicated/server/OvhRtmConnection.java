package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations about opened sockets on the server
 */
public class OvhRtmConnection {
	/**
	 * System user ID
	 *
	 * canBeNull
	 */
	public Long uid;

	/**
	 * Path to the program
	 *
	 * canBeNull
	 */
	public String exe;

	/**
	 * Complete command line used for starting this process
	 *
	 * canBeNull
	 */
	public String cmdline;

	/**
	 * Port opened
	 *
	 * canBeNull
	 */
	public Long port;

	/**
	 * The IP address connected
	 *
	 * canBeNull
	 */
	public String ip;

	/**
	 * Domain used by the process
	 *
	 * canBeNull
	 */
	public String domain;

	/**
	 * Process ID
	 *
	 * canBeNull
	 */
	public Long pid;

	/**
	 * Name of the process
	 *
	 * canBeNull
	 */
	public String procname;

	/**
	 * Username used to start the process
	 *
	 * canBeNull
	 */
	public String username;
}
