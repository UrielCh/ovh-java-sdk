package net.minidev.ovh.api.cdnanycast;

/**
 * CDN Pop
 */
public class OvhPop {
	/**
	 * canBeNull && readOnly
	 */
	public String city;

	/**
	 * Name of the pop
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public String comment;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPopStatusEnum status;
}
