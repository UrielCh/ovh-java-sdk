package net.minidev.ovh.api.dedicated.server;

/**
 * Available boots
 */
public class OvhNetboot {
	/**
	 * The boot kernel
	 *
	 * canBeNull && readOnly
	 */
	public String kernel;

	/**
	 * boot id
	 *
	 * canBeNull && readOnly
	 */
	public Long bootId;

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
