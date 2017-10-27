package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Possible customer questions
 */
public enum OvhProblemTypeEnum {
	lowBandwidth("lowBandwidth"),
	syncLoss("syncLoss");

	final String value;

	OvhProblemTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
