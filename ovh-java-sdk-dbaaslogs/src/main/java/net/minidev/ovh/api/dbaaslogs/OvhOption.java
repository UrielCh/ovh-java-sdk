package net.minidev.ovh.api.dbaaslogs;

import java.util.Date;

/**
 * DBaaS Logs option
 */
public class OvhOption {
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
	 * Service creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

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
	 * Option UUID
	 *
	 * canBeNull && readOnly
	 */
	public String optionId;

	/**
	 * Maximum number of dashboard allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbDashboard;

	/**
	 * Service last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;

	/**
	 * Maximum number of alias allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNbAlias;
}
