package net.minidev.ovh.api.ip;

import java.util.Date;

/**
 * Rule on ip
 */
public class OvhFirewallNetworkRule {
	/**
	 * Destination port range for your rule. Only with TCP/UDP protocol
	 *
	 * canBeNull && readOnly
	 */
	public String destinationPort;

	/**
	 * canBeNull && readOnly
	 */
	public Long sequence;

	/**
	 * Network protocol
	 *
	 * canBeNull && readOnly
	 */
	public OvhFirewallProtocolEnum protocol;

	/**
	 * Source port range for your rule. Only with TCP/UDP protocol
	 *
	 * canBeNull && readOnly
	 */
	public String sourcePort;

	/**
	 * TCP option on your rule
	 *
	 * canBeNull && readOnly
	 */
	public String tcpOption;

	/**
	 * Destination ip for your rule
	 *
	 * canBeNull && readOnly
	 */
	public String destination;

	/**
	 * canBeNull && readOnly
	 */
	public String rule;

	/**
	 * Action on this rule
	 *
	 * canBeNull && readOnly
	 */
	public OvhFirewallActionEnum action;

	/**
	 * Fragments option
	 *
	 * canBeNull && readOnly
	 */
	public Boolean fragments;

	/**
	 * Source ip for your rule
	 *
	 * canBeNull && readOnly
	 */
	public String source;

	/**
	 * Current state of your rule
	 *
	 * canBeNull && readOnly
	 */
	public OvhFirewallRuleStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
