package net.minidev.ovh.api.dbaas.logs;

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
	 * Index size in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long indexSize;

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
	 * Option UUID
	 *
	 * canBeNull && readOnly
	 */
	public String optionId;

	/**
	 * Current number of input booked
	 *
	 * canBeNull && readOnly
	 */
	public Long curNbInput;

	/**
	 * Option state
	 *
	 * canBeNull && readOnly
	 */
	public OvhOptionStateEnum state;

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

	/**
	 * Service last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
