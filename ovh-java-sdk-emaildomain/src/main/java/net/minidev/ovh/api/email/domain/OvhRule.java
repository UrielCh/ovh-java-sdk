package net.minidev.ovh.api.email.domain;

import net.minidev.ovh.api.domain.OvhDomainFilterOperandEnum;

/**
 * Rule List
 */
public class OvhRule {
	/**
	 * Header to be filtered
	 *
	 * canBeNull && readOnly
	 */
	public String header;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Rule parameter of filter
	 *
	 * canBeNull && readOnly
	 */
	public String value;

	/**
	 * Rule of filter
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainFilterOperandEnum operand;
}
