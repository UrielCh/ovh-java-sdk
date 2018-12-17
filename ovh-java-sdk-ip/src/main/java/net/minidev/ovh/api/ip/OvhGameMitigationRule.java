package net.minidev.ovh.api.ip;

import net.minidev.ovh.api.complextype.OvhRange;

/**
 * Rule on ip:ports
 */
public class OvhGameMitigationRule {
	/**
	 * canBeNull && readOnly
	 */
	public OvhGameMitigationRuleProtocolEnum protocol;

	/**
	 * Current state of your rule
	 *
	 * canBeNull && readOnly
	 */
	public OvhGameMitigationRuleStateEnum state;

	/**
	 * ID of the rule
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhRange<Long> ports;
}
