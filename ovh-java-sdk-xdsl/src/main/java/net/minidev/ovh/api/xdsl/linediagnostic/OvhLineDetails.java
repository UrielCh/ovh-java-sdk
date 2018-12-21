package net.minidev.ovh.api.xdsl.linediagnostic;

import net.minidev.ovh.api.xdsl.OvhDslTypeEnum;

/**
 * Line informations
 */
public class OvhLineDetails {
	/**
	 * address of the access
	 *
	 * canBeNull
	 */
	public String address;

	/**
	 * is GTR access or not
	 *
	 * canBeNull
	 */
	public Boolean gtr;

	/**
	 * access name
	 *
	 * canBeNull
	 */
	public String accessName;

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
	 * Theoretical line capabilities
	 *
	 * canBeNull
	 */
	public OvhLineCapabilities lineCapabilities;

	/**
	 * cables sections details
	 *
	 * canBeNull
	 */
	public OvhSection[] sections;

	/**
	 * provider for internet connexion
	 *
	 * canBeNull
	 */
	public OvhProviderEnum operator;

	/**
	 * line number
	 *
	 * canBeNull
	 */
	public String number;

	/**
	 * dsl connexion type for the line
	 *
	 * canBeNull
	 */
	public OvhDslTypeEnum lineType;

	/**
	 * Access IP ping or not
	 *
	 * canBeNull
	 */
	public Boolean accessPing;

	/**
	 * NRA name
	 *
	 * canBeNull
	 */
	public String nra;

	/**
	 * customer phone number for contact
	 *
	 * canBeNull
	 */
	public String contactPhone;

	/**
	 * informations directly get on DSLAM or Modem
	 *
	 * canBeNull
	 */
	public OvhConnectionInformations connectionInfo;
}
