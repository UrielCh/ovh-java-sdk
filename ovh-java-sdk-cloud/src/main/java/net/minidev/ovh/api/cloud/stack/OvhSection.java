package net.minidev.ovh.api.cloud.stack;

/**
 * Section
 */
public class OvhSection {
	/**
	 * Title of the guide section
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * Steps to follow
	 *
	 * canBeNull && readOnly
	 */
	public OvhStep[] steps;

	/**
	 * Content of the guide section
	 *
	 * canBeNull && readOnly
	 */
	public OvhContent[] content;
}
