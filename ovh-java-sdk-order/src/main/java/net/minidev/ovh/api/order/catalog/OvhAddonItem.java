package net.minidev.ovh.api.order.catalog;

/**
 * Describes an Addon
 */
public class OvhAddonItem {
	/**
	 * List of the addons of this family
	 *
	 * canBeNull && readOnly
	 */
	public OvhAddonOffer[] addons;

	/**
	 * Whether you can only have one instance of this addon family (xor)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean exclusive;

	/**
	 * Addon family name
	 *
	 * canBeNull && readOnly
	 */
	public String family;

	/**
	 * Indicated if addon family must be contracted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean mandatory;
}
