package net.minidev.ovh.api.domain;

/**
 * Values of number account (account, mailing list, redirection and responder)
 */
public class OvhDomainSummary {
	/**
	 * Number of responders
	 *
	 * canBeNull
	 */
	public Long responder;

	/**
	 * Number of redirections
	 *
	 * canBeNull
	 */
	public Long redirection;

	/**
	 * Number of mailboxes
	 *
	 * canBeNull
	 */
	public Long account;

	/**
	 * Number of mailing lists
	 *
	 * canBeNull
	 */
	public Long mailingList;
}
