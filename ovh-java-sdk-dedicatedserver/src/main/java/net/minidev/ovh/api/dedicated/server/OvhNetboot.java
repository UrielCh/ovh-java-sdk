package net.minidev.ovh.api.dedicated.server;

/**
 * Available boots
 */
public class OvhNetboot {
	/**
	 * boot id
	 *
	 * canBeNull && readOnly
	 */
	public Long bootId;

	/**
	 * The boot kernel
	 *
	 * canBeNull && readOnly
	 */
	public String kernel;

	/**
	 * the boot system
	 *
	 * canBeNull && readOnly
	 */
	public OvhBootTypeEnum bootType;

	/**
	 * the boot description
	 *
	 * canBeNull && readOnly
	 */
	public String description;
}
