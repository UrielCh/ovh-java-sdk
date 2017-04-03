package net.minidev.ovh.api.email.domain;

/**
 * Forward
 */
public class OvhForward {
	/**
	 * Source account of forward
	 *
	 * canBeNull && readOnly
	 */
	public String from;

	/**
	 * Target account of forward
	 *
	 * canBeNull && readOnly
	 */
	public String to;

	/**
	 * Id of forward
	 *
	 * canBeNull && readOnly
	 */
	public String id;
}
