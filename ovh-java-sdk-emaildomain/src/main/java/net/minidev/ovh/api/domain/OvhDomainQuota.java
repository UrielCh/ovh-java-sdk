package net.minidev.ovh.api.domain;

/**
 * Values of quota account (pop, mailing list, redirection, responder and big pop)
 */
public class OvhDomainQuota {
	/**
	 * Maximum number of aliases
	 *
	 * canBeNull
	 */
	public Long alias;

	/**
	 * Maximum number of responders
	 *
	 * canBeNull
	 */
	public Long responder;

	/**
	 * Maximum number of redirections
	 *
	 * canBeNull
	 */
	public Long redirection;

	/**
	 * Maximum number of mailing lists
	 *
	 * canBeNull
	 */
	public Long mailingList;

	/**
	 * Maximum number of mailboxes
	 *
	 * canBeNull
	 */
	public Long account;
}
