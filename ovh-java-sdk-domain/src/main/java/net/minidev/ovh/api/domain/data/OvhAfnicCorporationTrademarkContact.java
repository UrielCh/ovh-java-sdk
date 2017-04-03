package net.minidev.ovh.api.domain.data;

/**
 * Representation of an Inpi additional information for a corporation
 */
public class OvhAfnicCorporationTrademarkContact {
	/**
	 * Number of the Inpi declaration
	 *
	 * canBeNull && readOnly
	 */
	public String inpiNumber;

	/**
	 * Owner of the trademark
	 *
	 * canBeNull && readOnly
	 */
	public String inpiTrademarkOwner;

	/**
	 * Contact ID related to the Inpi additional information
	 *
	 * canBeNull && readOnly
	 */
	public Long contactId;

	/**
	 * Corporation Inpi additional information ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
