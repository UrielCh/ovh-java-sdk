package net.minidev.ovh.api.hosting.web.module;

/**
 * Dependency parameters. A dependency can be a standard database (like MySQL or PostgreSQL) or a key-value store (like Redis or Memcached) for example
 */
public class OvhDependencyType {
	/**
	 * The server on where your dependency is hosted
	 *
	 * canBeNull
	 */
	public String server;

	/**
	 * The password associated with the user
	 *
	 * canBeNull
	 */
	public String password;

	/**
	 * The port on where to contact this dependency
	 *
	 * canBeNull
	 */
	public Long port;

	/**
	 * The prefix to set to the data to distinguish between the data from the module and the rest
	 *
	 * canBeNull
	 */
	public String prefix;

	/**
	 * The name of this dependency
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Type
	 *
	 * canBeNull
	 */
	public OvhDependencyTypeEnum type;

	/**
	 * The user to use to connect to this dependency
	 *
	 * canBeNull
	 */
	public String user;
}
