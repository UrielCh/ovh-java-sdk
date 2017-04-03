package net.minidev.ovh.api.telephony;

/**
 * Time conditions
 */
public class OvhTimeCondition {
	/**
	 * canBeNull && readOnly
	 */
	public String hourEnd;

	/**
	 * canBeNull && readOnly
	 */
	public String hourBegin;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsDayEnum day;

	/**
	 * canBeNull && readOnly
	 */
	public String status;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsPolicyEnum policy;
}
