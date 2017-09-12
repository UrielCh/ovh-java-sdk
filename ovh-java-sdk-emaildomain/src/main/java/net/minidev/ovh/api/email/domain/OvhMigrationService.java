package net.minidev.ovh.api.email.domain;

import java.util.Date;

/**
 * Migration service
 */
public class OvhMigrationService {
	/**
	 * Billing contact of service
	 *
	 * canBeNull && readOnly
	 */
	public String contactBilling;

	/**
	 * Admin contact of service
	 *
	 * canBeNull && readOnly
	 */
	public String contactAdmin;

	/**
	 * Service name allowed as migration destination
	 *
	 * canBeNull && readOnly
	 */
	public String destinationServiceName;

	/**
	 * Tech contact of service
	 *
	 * canBeNull && readOnly
	 */
	public String contactTech;

	/**
	 * Expiration date of service
	 *
	 * canBeNull && readOnly
	 */
	public Date expiration;

	/**
	 * Offer type of service
	 *
	 * canBeNull && readOnly
	 */
	public OvhMigrationServiceType type;

	/**
	 * Creation date of service
	 *
	 * canBeNull && readOnly
	 */
	public Date creation;
}
