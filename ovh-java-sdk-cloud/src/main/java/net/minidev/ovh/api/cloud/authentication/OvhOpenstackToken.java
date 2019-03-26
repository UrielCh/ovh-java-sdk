package net.minidev.ovh.api.cloud.authentication;

import java.util.Date;

/**
 * OpenstackToken
 */
public class OvhOpenstackToken {
	/**
	 * canBeNull && readOnly
	 */
	public Date expires_at;

	/**
	 * canBeNull && readOnly
	 */
	public String[] methods;

	/**
	 * canBeNull && readOnly
	 */
	public OvhCatalog[] catalog;

	/**
	 * canBeNull && readOnly
	 */
	public OvhRole[] roles;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTokenProject project;

	/**
	 * canBeNull && readOnly
	 */
	public Date issued_at;

	/**
	 * canBeNull && readOnly
	 */
	public OvhUserToken user;
}
