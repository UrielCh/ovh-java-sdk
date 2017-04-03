package net.minidev.ovh.api.sms;

/**
 * Sms reach list
 */
public class OvhException {
	/**
	 * The substitution sender used to bypass operator filter
	 *
	 * canBeNull && readOnly
	 */
	public String substitution;

	/**
	 * The type of routing restriction imposed by the operator
	 *
	 * canBeNull && readOnly
	 */
	public OvhRestrictionCodeEnum restrictionCode;

	/**
	 * The list of operators impacted.
	 *
	 * canBeNull && readOnly
	 */
	public String operators;

	/**
	 * The exception message
	 *
	 * canBeNull && readOnly
	 */
	public String[] messages;

	/**
	 * The abreviated country code.
	 *
	 * canBeNull && readOnly
	 */
	public String countrySuffixe;
}
