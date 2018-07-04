package net.minidev.ovh.api.overthebox;

/**
 * Tunnel mode of the service.
 */
public enum OvhTunnelModeEnum {
	glorytun("glorytun"),
	glorytun_hybrid("glorytun_hybrid"),
	glorytun_mud("glorytun_mud");

	final String value;

	OvhTunnelModeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
