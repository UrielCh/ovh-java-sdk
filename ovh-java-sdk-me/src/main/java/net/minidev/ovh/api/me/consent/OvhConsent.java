package net.minidev.ovh.api.me.consent;

/**
 * Customer consent information for a campaign
 */
public class OvhConsent {
	/**
	 * Campaign name
	 *
	 * canBeNull && readOnly
	 */
	public String campaign;

	/**
	 * Consent decisions history for this campaign
	 *
	 * canBeNull && readOnly
	 */
	public OvhDecision[] history;

	/**
	 * Campaign type
	 *
	 * canBeNull && readOnly
	 */
	public OvhCampaignTypeEnum type;

	/**
	 * Current consent value
	 *
	 * canBeNull && readOnly
	 */
	public Boolean value;
}
