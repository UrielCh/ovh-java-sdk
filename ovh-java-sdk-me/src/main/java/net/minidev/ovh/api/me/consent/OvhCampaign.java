package net.minidev.ovh.api.me.consent;

/**
 * Consent campaign
 */
public class OvhCampaign {
	/**
	 * Campaign name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Campaign description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Campaign type
	 *
	 * canBeNull && readOnly
	 */
	public OvhCampaignTypeEnum type;
}
