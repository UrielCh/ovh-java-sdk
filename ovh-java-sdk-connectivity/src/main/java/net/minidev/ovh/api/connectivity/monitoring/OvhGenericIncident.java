package net.minidev.ovh.api.connectivity.monitoring;

import java.util.Date;
import net.minidev.ovh.api.connectivity.OvhOperatorEnum;

/**
 * Generic incident structure
 */
public class OvhGenericIncident {
	/**
	 * List of impacted operators
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperatorEnum[] operators;

	/**
	 * End date, the generic incident is resolved and closed
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * Optional comment, that contains some informations and updates about the generic incident
	 *
	 * canBeNull && readOnly
	 */
	public String comment;

	/**
	 * Generic incident id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * List of impacted department codes
	 *
	 * canBeNull && readOnly
	 */
	public String[] departments;

	/**
	 * List of impacted NRA/NRO
	 *
	 * canBeNull && readOnly
	 */
	public String[] nra;

	/**
	 * Creation date, the generic incident has been detected
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Status (detected: we detected a potential generic incident, validated: the operators or our tech teams have confirmed the generic incident, closed: the generic incident is resolved and closed)
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericIncidentStatusEnum status;
}
