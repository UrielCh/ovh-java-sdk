package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Detected incident
 */
public class OvhIncident {
	/**
	 * Operator
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperatorTypeEnum[] operators;

	/**
	 * Estimated end date
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * canBeNull && readOnly
	 */
	public String comment;

	/**
	 * Department list
	 *
	 * canBeNull && readOnly
	 */
	public String[] departments;

	/**
	 * ID of the incident
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Estimated start date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * NRA list
	 *
	 * canBeNull && readOnly
	 */
	public String[] nra;

	/**
	 * Task ID on travaux.ovh.com
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;
}
