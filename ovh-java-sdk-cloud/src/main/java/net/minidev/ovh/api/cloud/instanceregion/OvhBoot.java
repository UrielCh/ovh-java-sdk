package net.minidev.ovh.api.cloud.instanceregion;

/**
 * Boot
 */
public class OvhBoot {
	/**
	 * Bootable component id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Bootable component type
	 *
	 * canBeNull && readOnly
	 */
	public OvhBootTypeEnum type;
}
