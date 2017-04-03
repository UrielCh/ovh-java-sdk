package net.minidev.ovh.api.telephony;

/**
 * PABX Hunting
 */
public class OvhOvhPabxHunting {
	/**
	 * The templated url of your CRM, opened by the banner application of your cloudpabx
	 *
	 * canBeNull && readOnly
	 */
	public String crmUrlTemplate;

	/**
	 * The name of your callcenter offer
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Enable G729 codec on your callcenter
	 *
	 * canBeNull && readOnly
	 */
	public Boolean g729;
}
