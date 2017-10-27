package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * bandwidth unit for proof.ovh.net test values
 */
public enum OvhBandwidthTestUnitEnum {
	Kbps("Kbps"),
	Mbps("Mbps");

	final String value;

	OvhBandwidthTestUnitEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
