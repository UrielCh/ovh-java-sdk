package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Eligibility of the portability of the line number
 */
public class OvhPortability {
	/**
	 * The reason(s) of the negative portability eligibility
	 *
	 * canBeNull
	 */
	public OvhCodeAndMessage[] comments;

	/**
	 * Whether or not it is possible to port the line number. If false, commentList contains the reason(s)
	 *
	 * canBeNull
	 */
	public Boolean eligible;

	/**
	 * The special condition(s) of the portability
	 *
	 * canBeNull
	 */
	public OvhCodeAndMessage[] warnings;

	/**
	 * Whether or not the portability is possible under condition. If true, warningList contains the reason(s)
	 *
	 * canBeNull
	 */
	public Boolean underCondition;
}
