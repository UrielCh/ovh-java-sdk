package net.minidev.ovh.api.zone;

/**
 * Resource record
 */
public class OvhResetRecord {
	/**
	 * canBeNull
	 */
	public OvhResettableNamedResolutionFieldTypeEnum fieldType;

	/**
	 * Resource record target
	 *
	 * canBeNull
	 */
	public String target;
}
