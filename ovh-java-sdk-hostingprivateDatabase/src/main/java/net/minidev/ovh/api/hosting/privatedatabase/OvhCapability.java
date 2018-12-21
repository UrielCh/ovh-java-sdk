package net.minidev.ovh.api.hosting.privatedatabase;

/**
 * Private database capability
 */
public class OvhCapability {
	/**
	 * Can the object be updated
	 *
	 * canBeNull
	 */
	public Boolean update;

	/**
	 * Can the object be created
	 *
	 * canBeNull
	 */
	public Boolean create;

	/**
	 * Can the object be deleted
	 *
	 * canBeNull
	 */
	public Boolean delete;

	/**
	 * Object name
	 *
	 * canBeNull
	 */
	public String object;
}
