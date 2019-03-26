package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Detected incident
 */
public class OvhIncident {
	/**
	 * Estimated end date
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * Operator
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperatorTypeEnum[] operators;

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
	 * NRA list
	 *
	 * canBeNull && readOnly
	 */
	public String[] nra;

	/**
	 * Estimated start date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Task ID on travaux.ovh.com
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;
}
