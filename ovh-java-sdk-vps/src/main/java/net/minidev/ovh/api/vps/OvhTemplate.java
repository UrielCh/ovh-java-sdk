package net.minidev.ovh.api.vps;

/**
 * Installation template for a VPS Virtual Machine
 */
public class OvhTemplate {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTemplateBitFormatEnum bitFormat;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public String locale;

	/**
	 * canBeNull && readOnly
	 */
	public String distribution;

	/**
	 * canBeNull && readOnly
	 */
	public String[] availableLanguage;
}
