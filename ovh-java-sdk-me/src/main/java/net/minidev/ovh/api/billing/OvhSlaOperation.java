package net.minidev.ovh.api.billing;

import java.util.Date;

/**
 * SLA properties
 */
public class OvhSlaOperation {
	/**
	 * Date of the event that led to SLA
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Date of the end of the SLA
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * Sla operation name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Description of the SLA operation for this incident
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * SLA identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Date of the start of the SLA
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;
}
