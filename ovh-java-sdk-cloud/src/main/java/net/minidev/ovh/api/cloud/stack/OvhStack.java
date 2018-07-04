package net.minidev.ovh.api.cloud.stack;

/**
 * Stack
 */
public class OvhStack {
	/**
	 * GIT repository
	 *
	 * canBeNull && readOnly
	 */
	public String gitRepository;

	/**
	 * Stack release tag
	 *
	 * canBeNull && readOnly
	 */
	public String release;

	/**
	 * List of customer inputs
	 *
	 * canBeNull && readOnly
	 */
	public OvhInput[] inputs;

	/**
	 * Stack name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Stack last commit
	 *
	 * canBeNull && readOnly
	 */
	public String commit;

	/**
	 * Resources used
	 *
	 * canBeNull && readOnly
	 */
	public OvhResources resources;

	/**
	 * Stack description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Stack uuid
	 *
	 * canBeNull && readOnly
	 */
	public String uuid;

	/**
	 * List of stack commands shortcuts
	 *
	 * canBeNull && readOnly
	 */
	public OvhCommand[] commands;
}
