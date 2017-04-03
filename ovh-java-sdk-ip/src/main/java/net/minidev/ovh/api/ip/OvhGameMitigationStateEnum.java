package net.minidev.ovh.api.ip;

/**
 * Possible values for udp mitigation rule state
 */
public enum OvhGameMitigationStateEnum {
	firewallModeDisablePending("firewallModeDisablePending"),
	firewallModeEnablePending("firewallModeEnablePending"),
	ok("ok");

	final String value;

	OvhGameMitigationStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
