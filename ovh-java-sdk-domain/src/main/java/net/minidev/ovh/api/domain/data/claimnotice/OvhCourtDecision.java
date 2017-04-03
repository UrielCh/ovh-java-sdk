package net.minidev.ovh.api.domain.data.claimnotice;

/**
 * Definition of a court decision
 */
public class OvhCourtDecision {
	/**
	 * Regions where court decision apply
	 *
	 * canBeNull && readOnly
	 */
	public String[] regions;

	/**
	 * Court name
	 *
	 * canBeNull && readOnly
	 */
	public String courtName;

	/**
	 * Reference number of court decision
	 *
	 * canBeNull && readOnly
	 */
	public String referenceNumber;

	/**
	 * Country code
	 *
	 * canBeNull && readOnly
	 */
	public String countryCode;
}
