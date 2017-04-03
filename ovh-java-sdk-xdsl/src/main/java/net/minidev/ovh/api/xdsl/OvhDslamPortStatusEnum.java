package net.minidev.ovh.api.xdsl;

/**
 * Different states of a DSLAM port
 */
public enum OvhDslamPortStatusEnum {
	activated("activated"),
	deactivated("deactivated"),
	outofsync("outofsync");

	final String value;

	OvhDslamPortStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
