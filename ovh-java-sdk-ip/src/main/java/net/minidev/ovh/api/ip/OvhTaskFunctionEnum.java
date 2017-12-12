package net.minidev.ovh.api.ip;

/**
 * different task operation
 */
public enum OvhTaskFunctionEnum {
	arinBlockReassign("arinBlockReassign"),
	changeRipeOrg("changeRipeOrg"),
	checkAndReleaseIp("checkAndReleaseIp"),
	genericMoveFloatingIp("genericMoveFloatingIp");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
