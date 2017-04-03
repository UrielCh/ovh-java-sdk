package net.minidev.ovh.api.xdsl.xdslmodemconfig;

/**
 * Level of the Firewall ( BlockAll will block all connections, Normal will block all incoming connections except those in PortMapping and let go all outgoing connections , Disabled will disable all the Firewall and let all incoming or outgoing connections pass through )
 */
public enum OvhEasyFirewallLevelEnum {
	BlockAll("BlockAll"),
	Disabled("Disabled"),
	Normal("Normal");

	final String value;

	OvhEasyFirewallLevelEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
