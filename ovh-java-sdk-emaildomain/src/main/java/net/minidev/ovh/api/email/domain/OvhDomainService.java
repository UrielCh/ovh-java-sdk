package net.minidev.ovh.api.email.domain;

import java.util.Date;
import net.minidev.ovh.api.domain.OvhDomainStatusEnum;

/**
 * Domain service
 */
public class OvhDomainService {
	/**
	 * Offer of email service
	 *
	 * canBeNull && readOnly
	 */
	public String offer;

	/**
	 * List of allowed sizes for this domain in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long[] allowedAccountSize;

	/**
	 * Name of servicelinked with this domain
	 *
	 * canBeNull && readOnly
	 */
	public String linkTo;

	/**
	 * Name of domain
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Creation date of domain
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Filerz of domain
	 *
	 * canBeNull && readOnly
	 */
	public Long filerz;

	/**
	 * Domain Status
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainStatusEnum status;
}
