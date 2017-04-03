package net.minidev.ovh.api.dedicatedcloud.filer;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A Filer profile
 */
public class OvhProfile {
	/**
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> size;

	/**
	 * Commercial name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Human-Readable name
	 *
	 * canBeNull
	 */
	public String fullName;
}
