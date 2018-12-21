package net.minidev.ovh.api.email.pro;

/**
 * Domain
 */
public class OvhDomain {
	/**
	 * Cname that will be checked to prove the domain ownership
	 *
	 * canBeNull && readOnly
	 */
	public String cnameToCheck;

	/**
	 * Domain SRV record configured in DNS
	 *
	 * canBeNull && readOnly
	 */
	public String[] srvRecord;

	/**
	 * Indicate if this domain is an alias for another domain
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isAliasDomain;

	/**
	 * List of aliases for this domain
	 *
	 * canBeNull && readOnly
	 */
	public String[] domainAliases;

	/**
	 * Domain MX record configured in DNS
	 *
	 * canBeNull && readOnly
	 */
	public String[] mxRecord;

	/**
	 * Domain validation status
	 *
	 * canBeNull && readOnly
	 */
	public Boolean domainValidated;

	/**
	 * Domain type
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainTypeEnum type;

	/**
	 * Pending taks id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * If true your dns srv record is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean srvIsValid;

	/**
	 * Domain name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * If true your dns mx configuration is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean mxIsValid;

	/**
	 * If specified, emails to not existing address will be redirected to that domain
	 *
	 * canBeNull && readOnly
	 */
	public String mxRelay;

	/**
	 * Domain state
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;
}
