package net.minidev.ovh.api.ip;

/**
 * GAME Anti-DDoS
 */
public class OvhGameMitigation {
	/**
	 * Firewall mode : in UDP, only allow traffic matching your rules (as well as established traffic). If not enabled, traffic to ports not defined in your rules will be permited. TCP traffic is unaffected by this.
	 *
	 * canBeNull && readOnly
	 */
	public Boolean firewallModeEnabled;

	/**
	 * canBeNull && readOnly
	 */
	public OvhGameMitigationStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public String ipOnGame;
}
