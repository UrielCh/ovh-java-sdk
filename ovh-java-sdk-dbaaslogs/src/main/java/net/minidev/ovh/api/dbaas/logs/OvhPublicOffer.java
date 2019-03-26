package net.minidev.ovh.api.dbaas.logs;

/**
 * DBaaS Logs offer
 */
public class OvhPublicOffer {
	/**
	 * Option unique reference
	 *
	 * canBeNull && readOnly
	 */
	public String reference;

	/**
	 * Number of GB stored per month included
	 *
	 * canBeNull && readOnly
	 */
	public Long esStorage;

	/**
	 * Maximum number of index allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbIndex;

	/**
	 * Maximum number of stream allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbStream;

	/**
	 * Maximum number of role allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbRole;

	/**
	 * Maximum number of input allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbInput;

	/**
	 * Maximum number of dashboard allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbDashboard;

	/**
	 * Maximum number of alias allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbAlias;
}
