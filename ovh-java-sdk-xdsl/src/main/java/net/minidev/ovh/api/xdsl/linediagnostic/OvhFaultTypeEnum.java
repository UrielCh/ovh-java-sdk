package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Line diagnostic fault type
 */
public enum OvhFaultTypeEnum {
	alignment("alignment"),
	noSync("noSync"),
	syncLossOrLowBandwidth("syncLossOrLowBandwidth");

	final String value;

	OvhFaultTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
