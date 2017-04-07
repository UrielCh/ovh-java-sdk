package net.minidev.ovh.api.api;

/**
 * 
 */
public class OvhUserKeystone {
	/**
	 * canBeNull && readOnly
	 */
	public String password;

	/**
	 * canBeNull && readOnly
	 */
	public OvhDomain domain;

	/**
	 * canBeNull && readOnly
	 */
	public OvhScopeKeystone scope;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public String id;
}
