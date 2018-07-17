package net.minidev.ovh.api.cloud.stack;

/**
 * InstructionGuide
 */
public class OvhInstructionGuide {
	/**
	 * Guide language
	 *
	 * canBeNull && readOnly
	 */
	public String language;

	/**
	 * Guide title
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * Guide introduction content
	 *
	 * canBeNull && readOnly
	 */
	public OvhContent[] content;

	/**
	 * Sections of the guide
	 *
	 * canBeNull && readOnly
	 */
	public OvhSection[] sections;
}
