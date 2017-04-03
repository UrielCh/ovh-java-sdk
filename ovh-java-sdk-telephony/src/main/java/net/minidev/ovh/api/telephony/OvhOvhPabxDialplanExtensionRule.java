package net.minidev.ovh.api.telephony;

/**
 * Dialplan rule
 */
public class OvhOvhPabxDialplanExtensionRule {
	/**
	 * If true, the rule will be executed only when the result of the conditions is false
	 *
	 * canBeNull && readOnly
	 */
	public Boolean negativeAction;

	/**
	 * The action made by the rule
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxDialplanExtensionRuleActionEnum action;

	/**
	 * The position of the rule in the extension (the rules are executed following this order)
	 *
	 * canBeNull && readOnly
	 */
	public Long position;

	/**
	 * canBeNull && readOnly
	 */
	public Long ruleId;

	/**
	 * The parameter of the chosen action
	 *
	 * canBeNull && readOnly
	 */
	public String actionParam;
}
