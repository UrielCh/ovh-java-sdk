package net.minidev.ovh.api.msservices;

/**
 * Active Directory organizational unit
 */
public class OvhActiveDirectoryOrganizationalUnit {
	/**
	 * Service name of the office tenant (/licence/office/{serviceName}) linked to this AD service
	 *
	 * canBeNull && readOnly
	 */
	public String officeTenantServiceName;

	/**
	 * Minimum lifespan of passwords, in days (0 = unlimited)
	 *
	 * canBeNull && readOnly
	 */
	public Long minPasswordAge;

	/**
	 * Account lock time (in minutes) when too much passwords have been tried
	 *
	 * canBeNull && readOnly
	 */
	public Long lockoutDuration;

	/**
	 * Maximum number of password tries before account locking
	 *
	 * canBeNull && readOnly
	 */
	public Long lockoutThreshold;

	/**
	 * Minimum number of characters passwords must contain
	 *
	 * canBeNull && readOnly
	 */
	public Long minPasswordLength;

	/**
	 * Name of the Active Directory organizational unit
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Current state of the Active Directory organizational unit
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceStateEnum state;

	/**
	 * Time (in minutes) before the password attempts counter is reset
	 *
	 * canBeNull && readOnly
	 */
	public Long lockoutObservationWindow;

	/**
	 * Maximum lifespan of passwords, in days
	 *
	 * canBeNull && readOnly
	 */
	public Long maxPasswordAge;

	/**
	 * Flag indicating if passwords should be forced to follow Microsoft's password guidelines
	 *
	 * canBeNull && readOnly
	 */
	public Boolean complexityEnabled;

	/**
	 * Task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
