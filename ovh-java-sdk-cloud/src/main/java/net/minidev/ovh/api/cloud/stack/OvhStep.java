package net.minidev.ovh.api.cloud.stack;

/**
 * Step
 */
public class OvhStep {
	/**
	 * Title of the step
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * Content of the step
	 *
	 * canBeNull && readOnly
	 */
	public OvhContent[] content;
}
