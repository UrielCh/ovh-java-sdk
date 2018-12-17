package net.minidev.ovh.api.domain.data.claimnotice;

/**
 * Definition of a single claim notice
 */
public class OvhClaimNoticeDecision {
	/**
	 * Classifications where trademark claim notice apply
	 *
	 * canBeNull && readOnly
	 */
	public OvhClassification[] classifications;

	/**
	 * Trademark contacts
	 *
	 * canBeNull && readOnly
	 */
	public OvhContact[] trademarkContacts;

	/**
	 * Trademark holders
	 *
	 * canBeNull && readOnly
	 */
	public OvhContact[] trademarkHolders;

	/**
	 * Mark name implicated in claim notice
	 *
	 * canBeNull && readOnly
	 */
	public String markName;

	/**
	 * Name of jurisdiction
	 *
	 * canBeNull && readOnly
	 */
	public String jurisdiction;

	/**
	 * Array of court decisions related to claim notice
	 *
	 * canBeNull && readOnly
	 */
	public OvhCourtDecision[] courtDecisions;

	/**
	 * Jurisdiction country code
	 *
	 * canBeNull && readOnly
	 */
	public String jurisdictionCountryCode;

	/**
	 * Goods and services on which apply claim notice
	 *
	 * canBeNull && readOnly
	 */
	public String goodsAndServices;

	/**
	 * Trademark UDRP informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhUDRP[] trademarkUDRP;
}
