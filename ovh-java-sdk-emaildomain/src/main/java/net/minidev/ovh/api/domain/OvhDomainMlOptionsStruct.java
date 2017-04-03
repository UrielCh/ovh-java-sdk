package net.minidev.ovh.api.domain;

/**
 * Structure of imapCopy
 */
public class OvhDomainMlOptionsStruct {
	/**
	 * If true, messages are moderate
	 *
	 * canBeNull
	 */
	public Boolean moderatorMessage;

	/**
	 * If true, just user can post
	 *
	 * canBeNull
	 */
	public Boolean usersPostOnly;

	/**
	 * If true, enabled moderation for subscribe
	 *
	 * canBeNull
	 */
	public Boolean subscribeByModerator;
}
