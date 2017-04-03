package net.minidev.ovh.api.domain.data.claimnotice;

/**
 * Definition of a UDRP procedure
 */
public class OvhUDRP {
	/**
	 * Case number
	 *
	 * canBeNull && readOnly
	 */
	public String caseNumber;

	/**
	 * UDRP Provider
	 *
	 * canBeNull && readOnly
	 */
	public String udrpProvider;
}
