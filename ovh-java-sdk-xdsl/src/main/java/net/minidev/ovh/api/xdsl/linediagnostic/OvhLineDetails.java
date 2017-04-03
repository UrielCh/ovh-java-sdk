package net.minidev.ovh.api.xdsl.linediagnostic;

import net.minidev.ovh.api.xdsl.OvhDslTypeEnum;

/**
 * Line informations
 */
public class OvhLineDetails {
	/**
	 * line number
	 *
	 * canBeNull
	 */
	public String number;

	/**
	 * address of the access
	 *
	 * canBeNull
	 */
	public String address;

	/**
	 * access name
	 *
	 * canBeNull
	 */
	public String accessName;

	/**
	 * is GTR access or not
	 *
	 * canBeNull
	 */
	public Boolean gtr;

	/**
	 * dsl connexion type for the line
	 *
	 * canBeNull
	 */
	public OvhDslTypeEnum lineType;

	/**
	 * Line length in meters
	 *
	 * canBeNull
	 */
	public Long length;

	/**
	 * custom access description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * DSLAM is synchronized or not
	 *
	 * canBeNull
	 */
	public Boolean dslamIsSynchronized;

	/**
	 * customer phone number for contact
	 *
	 * canBeNull
	 */
	public String contactPhone;

	/**
	 * NRA name
	 *
	 * canBeNull
	 */
	public String nra;

	/**
	 * provider for internet connexion
	 *
	 * canBeNull
	 */
	public OvhProviderEnum operator;

	/**
	 * cables sections details
	 *
	 * canBeNull
	 */
	public OvhSection[] sections;
}
