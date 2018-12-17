package net.minidev.ovh.api.cloud.stack;

/**
 * Stack
 */
public class OvhStack {
	/**
	 * Instructions to start the stack
	 *
	 * canBeNull && readOnly
	 */
	public OvhInstructionGuide[] instructions;

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
}
