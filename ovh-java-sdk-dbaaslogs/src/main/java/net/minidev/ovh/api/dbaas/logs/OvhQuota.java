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
	 * Current number of input booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbInput;

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
