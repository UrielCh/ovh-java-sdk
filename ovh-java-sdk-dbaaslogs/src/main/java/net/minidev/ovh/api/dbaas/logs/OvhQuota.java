package net.minidev.ovh.api.dbaas.logs;

/**
 * DBaaS Logs quota
 */
public class OvhQuota {
	/**
	 * Current number of index booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbIndex;

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
	 * Current number of alias booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbAlias;

	/**
	 * Current number of stream booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbStream;

	/**
	 * Maximum number of role allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbRole;

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
	 * Current number of dashboard booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbDashboard;

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
