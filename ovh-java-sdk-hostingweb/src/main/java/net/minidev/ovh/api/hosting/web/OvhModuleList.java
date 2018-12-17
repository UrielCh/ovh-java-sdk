package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.hosting.web.module.OvhAdminNameTypeEnum;
import net.minidev.ovh.api.hosting.web.module.OvhBranchEnum;
import net.minidev.ovh.api.hosting.web.module.OvhLanguageEnum;

/**
 * A module specifically packaged by OVH
 */
public class OvhModuleList {
	/**
	 * The IDs of the module you can upgrade to
	 *
	 * canBeNull && readOnly
	 */
	public Long[] upgradeFrom;

	/**
	 * The keywords for this module
	 *
	 * canBeNull && readOnly
	 */
	public String[] keywords;

	/**
	 * The packager of this module for OVH
	 *
	 * canBeNull && readOnly
	 */
	public String author;

	/**
	 * Is the module available?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean active;

	/**
	 * All available languages for this module
	 *
	 * canBeNull && readOnly
	 */
	public OvhLanguageEnum[] language;

	/**
	 * Minimal language version required to run this module
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<String> languageRequirement;

	/**
	 * The version of the module
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * The branch of the module
	 *
	 * canBeNull && readOnly
	 */
	public OvhBranchEnum branch;

	/**
	 * Size of the module
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> size;

	/**
	 * The type of the admin name
	 *
	 * canBeNull && readOnly
	 */
	public OvhAdminNameTypeEnum adminNameType;

	/**
	 * The name of the module
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The ID of the module
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Is this the latest version available?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean latest;
}
