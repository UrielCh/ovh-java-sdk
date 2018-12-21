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
	 * Enable G729 codec on your callcenter
	 *
	 * canBeNull && readOnly
	 */
	public Boolean g729;

	/**
	 * The name of your callcenter offer
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Enable/Disable the status change IVR on your callcenter. The IVR is enabled by default.
	 *
	 * canBeNull && readOnly
	 */
	public Boolean statusIvrEnabled;
}
