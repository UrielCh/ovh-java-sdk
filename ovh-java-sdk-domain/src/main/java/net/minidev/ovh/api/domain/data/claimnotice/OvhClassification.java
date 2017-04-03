package net.minidev.ovh.api.domain.data.claimnotice;

/**
 * Definition of a trademark claim notice classification
 */
public class OvhClassification {
	/**
	 * Code of the classification
	 *
	 * canBeNull && readOnly
	 */
	public String number;

	/**
	 * Summary of the classification
	 *
	 * canBeNull && readOnly
	 */
	public String description;
}
