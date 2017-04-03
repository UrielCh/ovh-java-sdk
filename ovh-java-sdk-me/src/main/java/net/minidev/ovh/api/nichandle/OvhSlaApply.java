package net.minidev.ovh.api.nichandle;

import java.util.Date;

/**
 * SLA properties
 */
public class OvhSlaApply {
	/**
	 * Date of the event that led to SLA
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

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
}
