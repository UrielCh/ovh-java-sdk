package net.minidev.ovh.api.nichandle.authentication;

import java.util.Date;
import net.minidev.ovh.api.nichandle.OvhRoleEnum;

/**
 * A group
 */
public class OvhGroup {
	/**
	 * Group's role
	 *
	 * canBeNull && readOnly
	 */
	public OvhRoleEnum role;

	/**
	 * True if it is an default group. This kind of group can't be edited or deleted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean defaultGroup;

	/**
	 * Last update of this group
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Group's name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Group's description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Creation date of this group
	 *
	 * canBeNull && readOnly
	 */
	public Date creation;
}
