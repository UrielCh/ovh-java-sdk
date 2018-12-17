package net.minidev.ovh.api.hosting.web.localseo;

/**
 * Struct describing a directory
 */
public class OvhDirectory {
	/**
	 * Identifier to use to get the result of a visibility check for the directory
	 *
	 * canBeNull
	 */
	public String code;

	/**
	 * Human-readable name of the directory
	 *
	 * canBeNull
	 */
	public String displayName;
}
