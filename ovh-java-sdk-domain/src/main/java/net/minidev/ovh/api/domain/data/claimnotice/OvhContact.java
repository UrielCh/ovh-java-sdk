package net.minidev.ovh.api.domain.data.claimnotice;

/**
 * Contact definition of a claim notice holder
 */
public class OvhContact {
	/**
	 * Address of holder
	 *
	 * canBeNull && readOnly
	 */
	public OvhAddress address;

	/**
	 * Name of claim notice holder
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Organisation name
	 *
	 * canBeNull && readOnly
	 */
	public String organisation;

	/**
	 * Legitimacy of holder
	 *
	 * canBeNull && readOnly
	 */
	public String entitlement;

	/**
	 * Type of contact
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Email address
	 *
	 * canBeNull && readOnly
	 */
	public String email;
}
