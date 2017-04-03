package net.minidev.ovh.api.ip;

/**
 * Possible values for mitigation state
 */
public enum OvhMitigationStateEnum {
	creationPending("creationPending"),
	ok("ok"),
	removalPending("removalPending");

	final String value;

	OvhMitigationStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
