package net.minidev.ovh.api.ip;

/**
 * Possible values for mitigation profile state
 */
public enum OvhMitigationProfileStateEnum {
	ok("ok"),
	tasksPending("tasksPending");

	final String value;

	OvhMitigationProfileStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
