package net.minidev.ovh.api.dbaas.logs;

/**
 * DBaaS Logs offer
 */
public class OvhOffer {
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
	 * Current number of role booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbRole;

	/**
	 * Current number of stream booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbStream;

	/**
	 * Current number of alias booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbAlias;

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
	 * Current number of dashboard booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbDashboard;

	/**
	 * Option unique reference
	 *
	 * canBeNull && readOnly
	 */
	public String reference;

	/**
	 * Current number of index booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbIndex;

	/**
	 * Maximum number of stream allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbStream;

	/**
	 * Current number of input booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbInput;

	/**
	 * Maximum number of dashboard allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbDashboard;

	/**
	 * Data retention in hours
	 *
	 * canBeNull && readOnly
	 */
	public Long retention;

	/**
	 * Maximum number of alias allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbAlias;
}
