package net.minidev.ovh.api.ip;

/**
 * Your IP on mitigation
 */
public class OvhMitigationIp {
	/**
	 * Set on true if your ip is on auto-mitigation
	 *
	 * canBeNull && readOnly
	 */
	public Boolean auto;

	/**
	 * canBeNull && readOnly
	 */
	public String ipOnMitigation;

	/**
	 * Set on true if your ip is on permanent mitigation
	 *
	 * canBeNull && readOnly
	 */
	public Boolean permanent;

	/**
	 * Current state of your ip on mitigation
	 *
	 * canBeNull && readOnly
	 */
	public OvhMitigationStateEnum state;
}
